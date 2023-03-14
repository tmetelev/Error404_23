//package org.firstinspires.ftc.teamcode.OpenCV;
//
//import com.acmerobotics.dashboard.config.Config;
//
//import org.opencv.core.Core;
//import org.opencv.core.CvType;
//import org.opencv.core.Mat;
//import org.opencv.core.Scalar;
//import org.opencv.imgproc.Imgproc;
//import org.openftc.easyopencv.OpenCvPipeline;
//
//@Config
//public class TestPipeline2 extends OpenCvPipeline {
//    public static int lgh = 69;
//    public static int lgs = (int) (0.7 * 255);
//    public static int lgv = (int) (0.9 * 255);
//
//    public static int hgh = 84;
//    public static int hgs= (int) (0.8 * 255);
//    public static int hgv = 100;
//    public Scalar lowerGreen = new Scalar(lgh, lgs, lgv);
//    public Scalar upperGreen = new Scalar(hgh, hgs, hgv);
//    Mat mat1 = new Mat();
//
//        @Override
//        public Mat processFrame(Mat input)
//        {
//            Imgproc.cvtColor(input, mat1, Imgproc.COLOR_RGB2HSV);
//            /**checking if any pixel is within the orange bounds to make a black and white mask**/
//            Mat mask1 = new Mat(mat1.rows(), mat1.cols(), CvType.CV_8UC1); // variable to store mask in
//            Core.inRange(mat1, lowerGreen, upperGreen, mask1);
//            return mask1;
//        }
//}
