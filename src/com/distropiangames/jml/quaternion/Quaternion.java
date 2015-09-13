package com.distropiangames.jml.quaternion;

import com.distropiangames.jml.vector.Vector3;
import com.distropiangames.jml.vector.Vector4;

public class Quaternion
{

    private float x;
    private float y;
    private float z;
    private float w;

    public Quaternion()
    {

        this(0.0f, 0.0f, 0.0f, 1.0f);

    }

    public Quaternion(float x, float y, float z, float w)
    {

        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;

    }

    public Quaternion(Vector3 axis, float angle)
    {

        float sinHalfAngle = (float) Math.sin(Math.toRadians(angle) / 2.0f);
        float cosHalfAngle = (float) Math.cos(Math.toRadians(angle) / 2.0f);

        this.x = axis.getX() * sinHalfAngle;
        this.y = axis.getY() * sinHalfAngle;
        this.z = axis.getZ() * sinHalfAngle;
        this.w = cosHalfAngle;

    }

    public float length()
    {

        return (float) Math.sqrt(x * x + y * y + z * z + w * w);

    }

    public void normalize()
    {

        float length = length();

        x /= length;
        y /= length;
        z /= length;
        w /= length;

    }

    public static Quaternion multiply(Quaternion value1, Vector3 value2)
    {

        float x = value1.getW() * value2.getX() + value1.getY() * value2.getZ() + value1.getZ() * value2.getY();
        float y = value1.getW() * value2.getY() + value1.getZ() * value2.getX() + value1.getX() * value2.getZ();
        float z = value1.getW() * value2.getZ() + value1.getX() * value2.getY() + value1.getY() * value2.getX();
        float w = -value1.getX() * value2.getX() - value1.getY() * value2.getY() - value1.getZ() * value2.getZ();

        return new Quaternion(x, y, z, w);

    }

    public static Quaternion multiply(Quaternion value1, Quaternion value2)
    {

        float x = value1.getX() * value2.getW() + value1.getW() * value2.getX() + value1.getY() * value2.getZ() + value1.getZ() * value2.getY();
        float y = value1.getY() * value2.getW() + value1.getW() * value2.getY() + value1.getZ() * value2.getX() + value1.getX() * value2.getZ();
        float z = value1.getZ() * value2.getW() + value1.getW() * value2.getZ() + value1.getX() * value2.getY() + value1.getY() * value2.getX();
        float w = value1.getW() * value2.getW() - value1.getX() * value2.getX() - value1.getY() * value2.getY() - value1.getZ() * value2.getZ();

        return new Quaternion(x, y, z, w);

    }

    public static Quaternion conjugate(Quaternion value)
    {

        return new Quaternion(-value.getX(), -value.getY(), -value.getZ(), value.getW());

    }

    public static Quaternion rotate(Quaternion value, Vector3 axis, float angle)
    {

        return Quaternion.normalize(Quaternion.multiply(value, new Quaternion(axis, angle)));

    }

    public static Quaternion rotateX(Quaternion value, float angle)
    {

        return Quaternion.rotate(value, new Vector3(1.0f, 0.0f, 0.0f), angle);

    }

    public static Quaternion rotateY(Quaternion value, float angle)
    {

        return Quaternion.rotate(value, new Vector3(0.0f, 1.0f, 0.0f), angle);

    }

    public static Quaternion rotateZ(Quaternion value, float angle)
    {

        return Quaternion.rotate(value, new Vector3(0.0f, 0.0f, 1.0f), angle);

    }

    public static Vector3 getLeft(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(-1.0f, 0.0f, 0.0f), value));

    }

    public static Vector3 getRight(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(1.0f, 0.0f, 0.0f), value));

    }

    public static Vector3 getDown(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(0.0f, -1.0f, 0.0f), value));

    }

    public static Vector3 getUp(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(0.0f, 1.0f, 0.0f), value));

    }

    public static Vector3 getForward(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(0.0f, 0.0f, -1.0f), value));

    }

    public static Vector3 getBack(Quaternion value)
    {

        return Vector3.normalize(Vector3.rotate(new Vector3(0.0f, 0.0f, 1.0f), value));

    }

    public static Vector3 getEulerAngles(Quaternion value)
    {

        Vector3 result = new Vector3();

        result.setX((float) Math.toDegrees(Math.atan2(2.0f * (value.getX() * value.getW() - value.getY() * value.getZ()), 1.0f - 2.0f * (value.getX() * value.getX() + value.getY() * value.getY()))));
        result.setY((float) Math.toDegrees(Math.asin(2.0f * (value.getX() * value.getZ() + value.getY() * value.getW()))));
        result.setZ((float) Math.toDegrees(Math.atan2(2.0f * (value.getZ() * value.getW() - value.getX() * value.getY()), 1.0f - 2.0f * (value.getY() * value.getY() + value.getZ() * value.getZ()))));

        return result;

    }

    public static float getAngle(Quaternion value)
    {

        double angle = 2.0d * Math.acos(value.getW());

        return (float) Math.toDegrees(angle <= Math.PI ? angle : 2.0d * Math.PI - angle);

    }

    public static boolean equals(Quaternion value1, Quaternion value2)
    {

        return value1.getX() == value2.getX() && value2.getY() == value2.getY() && value1.getZ() == value2.getZ() && value1.getW() == value2.getW();

    }

    public static Quaternion normalize(Quaternion value)
    {

        Quaternion quaternion = new Quaternion(value.getX(), value.getY(), value.getZ(), value.getW());

        quaternion.normalize();

        return quaternion;

    }

    public Vector4 getVector4()
    {

        return new Vector4(x, y, z, w);

    }

    public float getX()
    {

        return x;

    }

    public void setX(float x)
    {

        this.x = x;

    }

    public float getY()
    {

        return y;

    }

    public void setY(float y)
    {

        this.y = y;

    }

    public float getZ()
    {

        return z;

    }

    public void setZ(float z)
    {

        this.z = z;

    }

    public float getW()
    {

        return w;

    }

    public void setW(float w)
    {

        this.w = w;

    }

}
