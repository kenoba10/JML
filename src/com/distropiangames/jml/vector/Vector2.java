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

    public static float cross(Vector2 value1, Vector2 value2)
    {

        return value1.getX() * value2.getY() - value1.getY() * value2.getX();

    }

    public static float dot(Vector2 value1, Vector2 value2)
    {

        return value1.getX() * value2.getX() + value1.getY() * value2.getY();

    }

    public static Vector2 lerp(Vector2 value, Vector2 destination, float factor)
    {

        return Vector2.add(Vector2.multiply(Vector2.subtract(destination, value), factor), value);

    }

    public static Vector2 rotate(Vector2 value, float angle)
    {

        double radians = Math.toRadians(angle);

        double cos = Math.cos(radians);
        double sin = Math.sin(radians);

        return new Vector2((float) (value.getX() * cos - value.getY() * sin), (float) (value.getX() * sin + value.getY() * cos));

    }

    public static Vector2 perpendicular(Vector2 value)
    {

        return new Vector2(value.getY(), value.getX() * -1.0f);

    }

    public static float angle(Vector2 value1, Vector2 value2)
    {

        return (float) Math.atan2(Vector2.cross(value1, value2), Vector2.dot(value1, value2));

    }

    public static float min(Vector2 value)
    {

        return Math.min(value.getX(), value.getY());

    }

    public static float max(Vector2 value)
    {

        return Math.max(value.getX(), value.getY());

    }

    public static Vector2 min(Vector2 value1, Vector2 value2)
    {

        return value1.length() < value2.length() ? value1 : value2;

    }

    public static Vector2 max(Vector2 value1, Vector2 value2)
    {

        return value1.length() > value2.length() ? value1 : value2;

    }

    public static Vector2 abs(Vector2 value)
    {

        return new Vector2(Math.abs(value.getX()), Math.abs(value.getY()));

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
