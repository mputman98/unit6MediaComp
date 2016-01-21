/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
    
    public static void testKeepOnlyBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.KeepOnlyBlue();
        beach.explore();
    }
    
    public static void testNegate()
    {
        Picture cookie = new Picture("pedro-sena-fatima-s-followers-by-lordigan-d95340t");
        cookie.explore();
        cookie.Negate();
        cookie.explore();
    }
    
    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorVerticalRightToLeft()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    public static void testMirrorHorizontalTopToBot()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontalTopToBot();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testMirrorArms()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    public static void testMirrorSeagull(){
        Picture Seagull = new Picture("seagull.jpg");
        Seagull.explore();
        Seagull.mirrorSeagull();
        Seagull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }
    
    public static void testmyCollage()
    {
        Picture canvas = new Picture(480,630);
        canvas.myCollage();
        canvas.explore();
    }
    
    public static void testCopy(){
        Picture snowman = new Picture("snowman.jpg");
        Picture Seagull = new Picture("seagull.jpg");
        snowman.explore();
        snowman.copy(Seagull,40,20);
        snowman.explore();
    }
    
    public static void testcropAndCopy(){
        Picture snowman = new Picture("snowman.jpg");
        Picture Seagull = new Picture("seagull.jpg");
        snowman.explore();
        snowman.cropAndCopy(Seagull,40,150,60,230,80,150);
        snowman.explore();
    }
    
    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.explore();
        swan.edgeDetection(10);
        swan.explore();
    }
    
    /** Method to test edgeDetection */
    public static void testGrayscale()
    {
        Picture swan = new Picture("beach.jpg");
        swan.grayscale();
        swan.explore();
    }
    
     public static void testfixBlue()
    {
        Picture water = new Picture("water.jpg");
        water.fixBlue();
        water.explore();
    }
    
    public static void testfixBlue2()
    {
        Picture water = new Picture("water.jpg");
        water.fixBlue2();
        water.explore();
    }
    
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run

        // DigitalPicture p = new DigitalPicture(); Doesn't Work
        // DigitalPicture p = new SimplePicture(); Works
        // DigitalPicture p = new Picture(); Works
        // SimplePicture p = new Picture(); Works
        // Picture p = new SimplePicture(); Doesn't Work

    
        testZeroBlue();
        testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testGrayscale();
        testfixBlue();
        testfixBlue2();
        testMirrorVertical();
        testMirrorVerticalRightToLeft();
        testMirrorHorizontal();
        testMirrorHorizontalTopToBot();
        testMirrorTemple();
        testMirrorArms();
        testMirrorSeagull();
        testNegate();
        testmyCollage();
        //testMirrorDiagonal();
        testCollage();
        testCopy();
        testcropAndCopy();
        testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}