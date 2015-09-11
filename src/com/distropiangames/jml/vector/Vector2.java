package com.distropiangames.jml.vector;

public class Vector2
{

    private float x;
    private float y;

    public Vector2()
    {

        this(0.0f);

    }

    public Vector2(float value)
    {

        this(value, value);

    }

    public Vector2(float x, float y)
    {

        this.x = x;
        this.y = y;

    }

    public void add(float value)
    {

        add(new Vector2(value));

    }

    public void add(Vector2 value)
    {

        x += value.getX();
        y += value.getY();

    }

    public void subtract(float value)
    {

        subtract(new Vector2(value));

    }

    public void subtract(Vector2 value)
    {

        x -= value.getX();
        y -= value.getY();

    }

    public void multiply(float value)
    {

        multiply(new Vector2(value));

    }

    public void multiply(Vector2 value)
    {

        x *= value.getX();
        y *= value.getY();

    }

    public void divide(float value)
    {

        divide(new Vector2(value));

    }

    public void divide(Vector2 value)
    {

        x /= value.getX();
        y /= value.getY();

    }

    public float length()
    {

        return (float) Math.sqrt(x * x + y * y);

    }

    public void normalize()
    {

        float length = length();

        x /= length;
        y /= length;

    }

    public String toString()
    {

        return "(" + x + ", " + y + ")";

    }

    public static Vector2 add(Vector2 value1, float value2)
    {

        return Vector2.add(value1, new Vector2(value2));

    }

    public static Vector2 add(Vector2 value1, Vector2 value2)
    {

        Vector2 vector1 = new Vector2(value1.getX(), value1.getY());
        Vector2 vector2 = new Vector2(value2.getX(), value2.getY());

        vector1.add(vector2);

        return vector1;

    }

    public static Vector2 subtract(Vector2 value1, float value2)
    {

        return Vector2.subtract(value1, new Vector2(value2));

    }

    public static Vector2 subtract(Vector2 value1, Vector2 value2)
    {

        Vector2 vector1 = new Vector2(value1.getX(), value1.getY());
        Vector2 vector2 = new Vector2(value2.getX(), value2.getY());

        vector1.subtract(vector2);

        return vector1;

    }

    public static Vector2 multiply(Vector2 value1, float value2)
    {

        return Vector2.multiply(value1, new Vector2(value2));

    }

    public static Vector2 multiply(Vector2 value1, Vector2 value2)
    {

        Vector2 vector1 = new Vector2(value1.getX(), value1.getY());
        Vector2 vector2 = new Vector2(value2.getX(), value2.getY());

        vector1.multiply(vector2);

        return vector1;

    }

    public static Vector2 divide(Vector2 value1, float value2)
    {

        return Vector2.divide(value1, new Vector2(value2));

    }

    public static Vector2 divide(Vector2 value1, Vector2 value2)
    {

        Vector2 vector1 = new Vector2(value1.getX(), value1.getY());
        Vector2 vector2 = new Vector2(value2.getX(), value2.getY());

        vector1.divide(vector2);

        return vector1;

    }

    public static boolean equals(Vector2 value1, Vector2 value2)
    {

        return value1.getX() == value2.getX() && value2.getY() == value2.getY();

    }

    public static Vector2 normalize(Vector2 value)
    {

        Vector2 vector = new Vector2(value.getX(), value.getY());

        vector.normalize();

        return vector;

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

}
