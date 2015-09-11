package com.distropiangames.jml.vector;

public class Vector4
{

    private float x;
    private float y;
    private float z;
    private float w;

    public Vector4()
    {

        this(0.0f);

    }

    public Vector4(float value)
    {

        this(value, value, value, value);

    }

    public Vector4(float x, float y, float z, float w)
    {

        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;

    }

    public void add(float value)
    {

        add(new Vector4(value));

    }

    public void add(Vector4 value)
    {

        x += value.getX();
        y += value.getY();
        z += value.getZ();
        w += value.getW();

    }

    public void subtract(float value)
    {

        subtract(new Vector4(value));

    }

    public void subtract(Vector4 value)
    {

        x -= value.getX();
        y -= value.getY();
        z -= value.getZ();
        w -= value.getW();

    }

    public void multiply(float value)
    {

        multiply(new Vector4(value));

    }

    public void multiply(Vector4 value)
    {

        x *= value.getX();
        y *= value.getY();
        z *= value.getZ();
        w *= value.getW();

    }

    public void divide(float value)
    {

        divide(new Vector4(value));

    }

    public void divide(Vector4 value)
    {

        x /= value.getX();
        y /= value.getY();
        z /= value.getZ();
        w /= value.getW();

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

    public String toString()
    {

        return "(" + x + ", " + y + ", " + z + ", " + w + ")";

    }

    public static Vector4 add(Vector4 value1, float value2)
    {

        return Vector4.add(value1, new Vector4(value2));

    }

    public static Vector4 add(Vector4 value1, Vector4 value2)
    {

        Vector4 vector1 = new Vector4(value1.getX(), value1.getY(), value1.getZ(), value1.getW());
        Vector4 vector2 = new Vector4(value2.getX(), value2.getY(), value2.getZ(), value2.getW());

        vector1.add(vector2);

        return vector1;

    }

    public static Vector4 subtract(Vector4 value1, float value2)
    {

        return Vector4.subtract(value1, new Vector4(value2));

    }

    public static Vector4 subtract(Vector4 value1, Vector4 value2)
    {

        Vector4 vector1 = new Vector4(value1.getX(), value1.getY(), value1.getZ(), value1.getW());
        Vector4 vector2 = new Vector4(value2.getX(), value2.getY(), value2.getZ(), value2.getW());

        vector1.subtract(vector2);

        return vector1;

    }

    public static Vector4 multiply(Vector4 value1, float value2)
    {

        return Vector4.multiply(value1, new Vector4(value2));

    }

    public static Vector4 multiply(Vector4 value1, Vector4 value2)
    {

        Vector4 vector1 = new Vector4(value1.getX(), value1.getY(), value1.getZ(), value1.getW());
        Vector4 vector2 = new Vector4(value2.getX(), value2.getY(), value2.getZ(), value2.getW());

        vector1.multiply(vector2);

        return vector1;

    }

    public static Vector4 divide(Vector4 value1, float value2)
    {

        return Vector4.divide(value1, new Vector4(value2));

    }

    public static Vector4 divide(Vector4 value1, Vector4 value2)
    {

        Vector4 vector1 = new Vector4(value1.getX(), value1.getY(), value1.getZ(), value1.getW());
        Vector4 vector2 = new Vector4(value2.getX(), value2.getY(), value2.getZ(), value2.getW());

        vector1.divide(vector2);

        return vector1;

    }

    public static boolean equals(Vector4 value1, Vector4 value2)
    {

        return value1.getX() == value2.getX() && value2.getY() == value2.getY() && value1.getZ() == value2.getZ() && value1.getW() == value2.getW();

    }

    public static Vector4 normalize(Vector4 value)
    {

        Vector4 vector = new Vector4(value.getX(), value.getY(), value.getZ(), value.getW());

        vector.normalize();

        return vector;

    }

    public Vector3 getXYZ()
    {

        return new Vector3(x, y, z);

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
