package com.distropiangames.jml.quaternion;

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
