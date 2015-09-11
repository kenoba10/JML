package com.distropiangames.jml.matrix;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Matrix2
{

    private float[][] values;

    public Matrix2()
    {

        values = new float[2][2];

    }

    public static Matrix2 multiply(Matrix2 value1, Matrix2 value2)
    {

        Matrix2 result = new Matrix2();

        result.set(0, 0, value1.get(0, 0) * value2.get(0, 0) + value1.get(1, 0) * value2.get(0, 1));
        result.set(0, 1, value1.get(0, 1) * value2.get(0, 0) + value1.get(1, 1) * value2.get(0, 1));

        result.set(1, 0, value1.get(0, 0) * value2.get(1, 0) + value1.get(1, 0) * value2.get(1, 1));
        result.set(1, 1, value1.get(0, 1) * value2.get(1, 0) + value1.get(1, 1) * value2.get(1, 1));

        return result;

    }

    public FloatBuffer asFloatBuffer()
    {

        FloatBuffer buffer = ByteBuffer.allocateDirect((2 * 2) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

        buffer.put(values[0][0]);
        buffer.put(values[0][1]);

        buffer.put(values[1][0]);
        buffer.put(values[1][1]);

        buffer.flip();

        return buffer;

    }

    public float get(int x, int y)
    {

        return values[x][y];

    }

    public void set(int x, int y, float value)
    {

        values[x][y] = value;

    }

}
