package org.firstinspires.ftc.teamcode.OpenCV;

import com.acmerobotics.dashboard.config.Config;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvPipeline;

@Config
public class TestPipeline extends OpenCvPipeline {
       // @Override
//        public Mat processFrame(Mat input)
//        {
//            return input;
//        }

    public static int lh = 0;
    public static int ls = (int) (0.7 * 255); //120
    public static int lv = (int) (0.7 * 255);

    public static int hh = 15;
    public static int hs = (int) (0.9 * 255);
    public static int hv = (int) (0.9 * 255);


    public Scalar lowerRed = new Scalar(lh, ls, lv);
    public Scalar upperRed = new Scalar(hh, hs, hv);

            // Notice this is declared as an instance variable (and re-used), not a local variableMat grey = new Mat();
            Mat mat = new Mat();

            @Override
            public Mat processFrame(Mat input)
            {
                Imgproc.cvtColor(input, mat, Imgproc.COLOR_RGB2HSV);

                /**checking if any pixel is within the orange bounds to make a black and white mask**/
                Mat mask = new Mat(mat.rows(), mat.cols(), CvType.CV_8UC1); // variable to store mask in
                Core.inRange(mat, lowerRed, upperRed, mask);
                return mask;
            }
        }
