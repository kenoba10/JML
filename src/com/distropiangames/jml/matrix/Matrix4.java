package com.distropiangames.jml.matrix;

import com.distropiangames.jml.quaternion.Quaternion;
import com.distropiangames.jml.vector.Vector2;
import com.distropiangames.jml.vector.Vector3;

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

    public static Matrix4 identity()
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, 1.0f);
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, 1.0f);
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, 1.0f);
        result.set(2, 3, 0.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 translation(Vector2 translation)
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, 1.0f);
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, 1.0f);
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, 1.0f);
        result.set(2, 3, 0.0f);

        result.set(3, 0, translation.getX());
        result.set(3, 1, translation.getY());
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 scale(Vector2 scale)
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, scale.getX());
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, scale.getY());
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, 1.0f);
        result.set(2, 3, 0.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 translation(Vector3 translation)
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, 1.0f);
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, 1.0f);
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, 1.0f);
        result.set(2, 3, 0.0f);

        result.set(3, 0, translation.getX());
        result.set(3, 1, translation.getY());
        result.set(3, 2, translation.getZ());
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 scale(Vector3 scale)
    {

        Matrix4 result = new Matrix4();

        result.set(0, 0, scale.getX());
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, scale.getY());
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, scale.getZ());
        result.set(2, 3, 0.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 rotation(Quaternion rotation)
    {

        Matrix4 result = new Matrix4();

        Vector3 r = Quaternion.getRight(rotation);
        Vector3 u = Quaternion.getUp(rotation);
        Vector3 b = Quaternion.getBack(rotation);

        result.set(0, 0, r.getX());
        result.set(0, 1, u.getX());
        result.set(0, 2, b.getX());
        result.set(0, 3, 0.0f);

        result.set(1, 0, r.getY());
        result.set(1, 1, u.getY());
        result.set(1, 2, b.getY());
        result.set(1, 3, 0.0f);

        result.set(2, 0, r.getZ());
        result.set(2, 1, u.getZ());
        result.set(2, 2, b.getZ());
        result.set(2, 3, 0.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 lookAt(Vector3 eye, Vector3 center, Vector3 up)
    {

        Matrix4 result = new Matrix4();

        Vector3 f = Vector3.normalize(Vector3.subtract(center, eye));
        Vector3 r = Vector3.normalize(Vector3.cross(f, up));
        Vector3 u = Vector3.normalize(Vector3.cross(r, f));

        result.set(0, 0, r.getX());
        result.set(0, 1, u.getX());
        result.set(0, 2, -f.getX());
        result.set(0, 3, 0.0f);

        result.set(1, 0, r.getY());
        result.set(1, 1, u.getY());
        result.set(1, 2, -f.getY());
        result.set(1, 3, 0.0f);

        result.set(2, 0, r.getZ());
        result.set(2, 1, u.getZ());
        result.set(2, 2, -f.getZ());
        result.set(2, 3, 0.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, 0.0f);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 orthographic(float left, float right, float bottom, float top, float near, float far)
    {

        Matrix4 result = new Matrix4();

        float width = right - left;
        float height = top - bottom;
        float depth = near - far;

        result.set(0, 0, 2.0f / width);
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, 2.0f / height);
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, 2.0f / depth);
        result.set(2, 3, 0.0f);

        result.set(3, 0, -(right + left) / width);
        result.set(3, 1, -(top + bottom) / height);
        result.set(3, 2, -(far + near) / depth);
        result.set(3, 3, 1.0f);

        return result;

    }

    public static Matrix4 perspective(float fov, float ar, float near, float far)
    {

        Matrix4 result = new Matrix4();

        float tanHalfFOV = (float) Math.tan(fov / 2.0f);
        float zRange = far - near;

        result.set(0, 0, 1.0f / (tanHalfFOV * ar));
        result.set(0, 1, 0.0f);
        result.set(0, 2, 0.0f);
        result.set(0, 3, 0.0f);

        result.set(1, 0, 0.0f);
        result.set(1, 1, 1.0f / tanHalfFOV);
        result.set(1, 2, 0.0f);
        result.set(1, 3, 0.0f);

        result.set(2, 0, 0.0f);
        result.set(2, 1, 0.0f);
        result.set(2, 2, -(far + near) / zRange);
        result.set(2, 3, 1.0f);

        result.set(3, 0, 0.0f);
        result.set(3, 1, 0.0f);
        result.set(3, 2, -2.0f * far * near / zRange);
        result.set(3, 3, 0.0f);

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
