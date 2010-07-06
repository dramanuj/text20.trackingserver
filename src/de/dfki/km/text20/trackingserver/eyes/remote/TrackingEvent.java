/*
 * TrackingEvent.java
 * 
 * Copyright (c) 2010, Ralf Biedert, DFKI. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA 02110-1301  USA
 *
 */
package de.dfki.km.text20.trackingserver.eyes.remote;

import java.awt.Point;

import de.dfki.km.text20.trackingserver.common.remote.CommonTrackingEvent;

/**
 * 
 * @author rb
 */
public class TrackingEvent extends CommonTrackingEvent {
    private static final long serialVersionUID = 3557480099000038721L;

    /** Position of the center gaze, of null if invalid */
    public Point centerGaze;

    /** Gaze position of the left eye, of null if invalid */
    public Point leftGaze;

    /** Gaze position of the right eye, of null if invalid */
    public Point rightGaze;

    /** Gaze position for left eye  (from 0.0 to 1.0) */
    public float[] gazeLeftPos = new float[2];

    /** Gaze position for right eye  (from 0.0 to 1.0)  */
    public float[] gazeRightPos = new float[2];

    /** Measured size of the left pupil (in mm) */
    public float pupilSizeLeft;

    /** Measured size of the right pupil (in mm) */
    public float pupilSizeRight;

    /** position of left eye (in values from 0.0 to 1.0 relative to the bounding box) */
    public float[] leftEyePos = new float[3];

    /** position of right eye (in values from 0.0 to 1.0 relative to the bounding box) */
    public float[] rightEyePos = new float[3];

    /** Distances in mm */
    public float[] eyeDistances = new float[2];

    // Old values go here (and will be removed soon)
    /** Estimated x-gaze position */
    public int _centerX;

    /** Estimated y-gaze position */
    public int _centerY;

    /** True if the centerX and centerY coordinates are both valid. */
    public boolean _centerValidity;

}