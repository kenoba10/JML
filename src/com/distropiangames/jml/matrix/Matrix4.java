package com.distropiangames.jml.matrix;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Matrix4
{

    private float[][] values;

    public Matrix4()
    {

        values = new float[4][4];

    }

    public static Matrix4 multiply(Matrix4 value1, Matrix4 value2)
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, value1.get(0, 0) * value2.get(0, 0) + value1.get(1, 0) * value2.get(0, 1) + value1.get(2, 0) * value2.get(0, 2) + value1.get(3, 0) * value2.get(0, 3));
        result.set(0, 1, value1.get(0, 1) * value2.get(0, 0) + value1.get(1, 1) * value2.get(0, 1) + value1.get(2, 1) * value2.get(0, 2) + value1.get(3, 1) * value2.get(0, 3));
        result.set(0, 2, value1.get(0, 2) * value2.get(0, 0) + value1.get(1, 2) * value2.get(0, 1) + value1.get(2, 2) * value2.get(0, 2) + value1.get(3, 2) * value2.get(0, 3));
        result.set(0, 3, value1.get(0, 3) * value2.get(0, 0) + value1.get(1, 3) * value2.get(0, 1) + value1.get(2, 3) * value2.get(0, 2) + value1.get(3, 3) * value2.get(0, 3));

        result.set(1, 0, value1.get(0, 0) * value2.get(1, 0) + value1.get(1, 0) * value2.get(1, 1) + value1.get(2, 0) * value2.get(1, 2) + value1.get(3, 0) * value2.get(1, 3));
        result.set(1, 1, value1.get(0, 1) * value2.get(1, 0) + value1.get(1, 1) * value2.get(1, 1) + value1.get(2, 1) * value2.get(1, 2) + value1.get(3, 1) * value2.get(1, 3));
        result.set(1, 2, value1.get(0, 2) * value2.get(1, 0) + value1.get(1, 2) * value2.get(1, 1) + value1.get(2, 2) * value2.get(1, 2) + value1.get(3, 2) * value2.get(1, 3));
        result.set(1, 3, value1.get(0, 3) * value2.get(1, 0) + value1.get(1, 3) * value2.get(1, 1) + value1.get(2, 3) * value2.get(1, 2) + value1.get(3, 3) * value2.get(1, 3));

        result.set(2, 0, value1.get(0, 0) * value2.get(2, 0) + value1.get(1, 0) * value2.get(2, 1) + value1.get(2, 0) * value2.get(2, 2) + value1.get(3, 0) * value2.get(2, 3));
        result.set(2, 1, value1.get(0, 1) * value2.get(2, 0) + value1.get(1, 1) * value2.get(2, 1) + value1.get(2, 1) * value2.get(2, 2) + value1.get(3, 1) * value2.get(2, 3));
        result.set(2, 2, value1.get(0, 2) * value2.get(2, 0) + value1.get(1, 2) * value2.get(2, 1) + value1.get(2, 2) * value2.get(2, 2) + value1.get(3, 2) * value2.get(2, 3));
        result.set(2, 2, value1.get(0, 3) * value2.get(2, 0) + value1.get(1, 3) * value2.get(2, 1) + value1.get(2, 3) * value2.get(2, 2) + value1.get(3, 3) * value2.get(2, 3));

        result.set(3, 0, value1.get(0, 0) * value2.get(3, 0) + value1.get(1, 0) * value2.get(3, 1) + value1.get(2, 0) * value2.get(3, 2) + value1.get(3, 0) * value2.get(3, 3));
        result.set(3, 1, value1.get(0, 1) * value2.get(3, 0) + value1.get(1, 1) * value2.get(3, 1) + value1.get(2, 1) * value2.get(3, 2) + value1.get(3, 1) * value2.get(3, 3));
        result.set(3, 2, value1.get(0, 2) * value2.get(3, 0) + value1.get(1, 2) * value2.get(3, 1) + value1.get(2, 2) * value2.get(3, 2) + value1.get(3, 2) * value2.get(3, 3));
        result.set(3, 2, value1.get(0, 3) * value2.get(3, 0) + value1.get(1, 3) * value2.get(3, 1) + value1.get(2, 3) * value2.get(3, 2) + value1.get(3, 3) * value2.get(3, 3));

        return result;

    }

    public FloatBuffer asFloatBuffer()
    {

        FloatBuffer buffer = ByteBuffer.allocateDirect((4 * 4) << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

        buffer.put(values[0][0]);
        buffer.put(values[0][1]);
        buffer.put(values[0][2]);
        buffer.put(values[0][3]);

        buffer.put(values[1][0]);
        buffer.put(values[1][1]);
        buffer.put(values[1][2]);
        buffer.put(values[1][3]);

        buffer.put(values[2][0]);
        buffer.put(values[2][1]);
        buffer.put(values[2][2]);
        buffer.put(values[2][3]);

        buffer.put(values[3][0]);
        buffer.put(values[3][1]);
        buffer.put(values[3][2]);
        buffer.put(values[3][3]);

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
