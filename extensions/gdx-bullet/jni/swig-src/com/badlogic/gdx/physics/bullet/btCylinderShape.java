/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCylinderShape extends btConvexInternalShape {
	private long swigCPtr;
	
	protected btCylinderShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btCylinderShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCylinderShape(long cPtr, boolean cMemoryOwn) {
		this("btCylinderShape", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btCylinderShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCylinderShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public Vector3 getHalfExtentsWithMargin() {
	return gdxBulletJNI.btCylinderShape_getHalfExtentsWithMargin(swigCPtr, this);
}

  public Vector3 getHalfExtentsWithoutMargin() {
	return gdxBulletJNI.btCylinderShape_getHalfExtentsWithoutMargin(swigCPtr, this);
}

  public btCylinderShape(Vector3 halfExtents) {
    this(gdxBulletJNI.new_btCylinderShape(halfExtents), true);
  }

  public int getUpAxis() {
    return gdxBulletJNI.btCylinderShape_getUpAxis(swigCPtr, this);
  }

  public float getRadius() {
    return gdxBulletJNI.btCylinderShape_getRadius(swigCPtr, this);
  }

}
