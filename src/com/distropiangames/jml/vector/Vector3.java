package com.distropiangames.jml.vector;

import com.distropiangames.jml.quaternion.Quaternion;

public class Vector3
{

    private float x;
    private float y;
    private float z;

    public Vector3()
    {

        this(0.0f);

    }

    public Vector3(float value)
    {

        this(value, value, value);

    }

    public Vector3(float x, float y, float z)
    {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public void add(float value)
    {

        add(new Vector3(value));

    }

    public void add(Vector3 value)
    {

        x += value.getX();
        y += value.getY();
        z += value.getZ();

    }

    public void subtract(float value)
    {

        subtract(new Vector3(value));

    }

    public void subtract(Vector3 value)
    {

        x -= value.getX();
        y -= value.getY();
        z -= value.getZ();

    }

    public void multiply(float value)
    {

        multiply(new Vector3(value));

    }

    public void multiply(Vector3 value)
    {

        x *= value.getX();
        y *= value.getY();
        z *= value.getZ();

    }

    public void divide(float value)
    {

        divide(new Vector3(value));

    }

    public void divide(Vector3 value)
    {

        x /= value.getX();
        y /= value.getY();
        z /= value.getZ();

    }

    public float length()
    {

        return (float) Math.sqrt(x * x + y * y + z * z);

    }

    public void normalize()
    {

        float length = length();

        x /= length;
        y /= length;
        z /= length;

    }

    public String toString()
    {

        return "(" + x + ", " + y + ", " + z + ")";

    }

    public static Vector3 add(Vector3 value1, float value2)
    {

        return Vector3.add(value1, new Vector3(value2));

    }

    public static Vector3 add(Vector3 value1, Vector3 value2)
    {

        Vector3 vector1 = new Vector3(value1.getX(), value1.getY(), value1.getZ());
        Vector3 vector2 = new Vector3(value2.getX(), value2.getY(), value2.getZ());

        vector1.add(vector2);

        return vector1;

    }

    public static Vector3 subtract(Vector3 value1, float value2)
    {

        return Vector3.subtract(value1, new Vector3(value2));

    }

    public static Vector3 subtract(Vector3 value1, Vector3 value2)
    {

        Vector3 vector1 = new Vector3(value1.getX(), value1.getY(), value1.getZ());
        Vector3 vector2 = new Vector3(value2.getX(), value2.getY(), value2.getZ());

        vector1.subtract(vector2);

        return vector1;

    }

    public static Vector3 multiply(Vector3 value1, float value2)
    {

        return Vector3.multiply(value1, new Vector3(value2));

    }

    public static Vector3 multiply(Vector3 value1, Vector3 value2)
    {

        Vector3 vector1 = new Vector3(value1.getX(), value1.getY(), value1.getZ());
        Vector3 vector2 = new Vector3(value2.getX(), value2.getY(), value2.getZ());

        vector1.multiply(vector2);

        return vector1;

    }

    public static Vector3 divide(Vector3 value1, float value2)
    {

        return Vector3.divide(value1, new Vector3(value2));

    }

    public static Vector3 divide(Vector3 value1, Vector3 value2)
    {

        Vector3 vector1 = new Vector3(value1.getX(), value1.getY(), value1.getZ());
        Vector3 vector2 = new Vector3(value2.getX(), value2.getY(), value2.getZ());

        vector1.divide(vector2);

        return vector1;

    }

    public static Vector3 cross(Vector3 value1, Vector3 value2)
    {

        return new Vector3(value1.getY() * value2.getZ() - value1.getZ() * value2.getY(), value1.getZ() * value2.getX() - value1.getX() * value2.getZ(), value1.getX() * value2.getY() - value1.getY() * value2.getX());

    }

    public static float dot(Vector3 value1, Vector3 value2)
    {

        return value1.getX() * value2.getX() + value1.getY() * value2.getY() + value1.getZ() * value2.getZ();

    }

    public static Vector3 lerp(Vector3 value, Vector3 destination, float factor)
    {

        return Vector3.add(Vector3.multiply(Vector3.subtract(destination, value), factor), value);

    }

    public static Vector3 rotate(Vector3 value, Quaternion rotation)
    {

        //To Be Made

        return null;

    }

    public static float min(Vector3 value)
    {

        return Math.min(value.getX(), Math.min(value.getY(), value.getZ()));

    }

    public static float max(Vector3 value)
    {

        return Math.max(value.getX(), Math.max(value.getY(), value.getZ()));

    }

    public static Vector3 min(Vector3 value1, Vector3 value2)
    {

        return value1.length() < value2.length() ? value1 : value2;

    }

    public static Vector3 max(Vector3 value1, Vector3 value2)
    {

        return value1.length() > value2.length() ? value1 : value2;

    }

    public static Vector3 abs(Vector3 value)
    {

        return new Vector3(Math.abs(value.getX()), Math.abs(value.getY()), Math.abs(value.getZ()));

    }

    public static boolean equals(Vector3 value1, Vector3 value2)
    {

        return value1.getX() == value2.getX() && value2.getY() == value2.getY() && value1.getZ() == value2.getZ();

    }

    public static Vector3 normalize(Vector3 value)
    {

        Vector3 vector = new Vector3(value.getX(), value.getY(), value.getZ());

        vector.normalize();

        return vector;

    }

    public Vector2 getXY()
    {

        return new Vector2(x, y);

    }

    public Vector2 getXZ()
    {

        return new Vector2(x, z);

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

}
