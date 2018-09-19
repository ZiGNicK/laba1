package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void divReal() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(1,2);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
    }

    @Test
    void divImag() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(1,2);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(0.0, result.getImag(), 0.1);
    }

    @Test
    void divNegReal() {
        // Arrange
        Complex a = new Complex(2,-4);
        Complex b = new Complex(-1,-3);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
    }

    @Test
    void divNegImag() {
        // Arrange
        Complex a = new Complex(2,-4);
        Complex b = new Complex(-1,-3);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(1.0, result.getImag(), 0.1);
    }

    @Test
    void divZeroReal() {
        // Arrange
        Complex a = new Complex(0,-4);
        Complex b = new Complex(-1,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(0.0, result.getReal(), 0.1);
    }

    @Test
    void divZeroImag() {
        // Arrange
        Complex a = new Complex(0,-4);
        Complex b = new Complex(-1,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(4.0, result.getImag(), 0.1);
    }

    @Test
    void divZeroZeroReal() {
        // Arrange
        Complex a = new Complex(3,-4);
        Complex b = new Complex(0,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, result.getReal(), 0.1);
    }

    @Test
    void divZeroZeroImag() {
        // Arrange
        Complex a = new Complex(3,-4);
        Complex b = new Complex(0,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result.getImag(), 0.1);
    }

    @Test
    void divINFReal() {
        // Arrange
        Complex a = new Complex(3,Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(Double.NaN, result.getReal(), 0.1);
    }

    @Test
    void divINFImag() {
        // Arrange
        Complex a = new Complex(3,Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(Double.NaN, result.getImag(), 0.1);
    }

    @Test
    void subReal() {
        // Arrange
        Complex a = new Complex(2,4);
        Complex b = new Complex(1,1);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
    }

    @Test
    void subImag() {
        // Arrange
        Complex a = new Complex(2,4);
        Complex b = new Complex(1,1);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(3.0, result.getImag(), 0.1);
    }

    @Test
    void subNegReal() {
        // Arrange
        Complex a = new Complex(2,-4);
        Complex b = new Complex(-1,-3);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(3.0, result.getReal(), 0.1);
    }

    @Test
    void subNegImag() {
        // Arrange
        Complex a = new Complex(2,-4);
        Complex b = new Complex(-1,-3);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(-1.0, result.getImag(), 0.1);
    }

    @Test
    void subZeroReal() {
        // Arrange
        Complex a = new Complex(2,0);
        Complex b = new Complex(0,1);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(2.0, result.getReal(), 0.1);
    }

    @Test
    void subZeroImag() {
        // Arrange
        Complex a = new Complex(2,0);
        Complex b = new Complex(0,1);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(-1.0, result.getImag(), 0.1);
    }

    @Test
    void subINFReal() {
        // Arrange
        Complex a = new Complex(2,Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result.getReal(), 0.1);
    }

    @Test
    void subINFImag() {
        // Arrange
        Complex a = new Complex(2,Double.POSITIVE_INFINITY);
        Complex b = new Complex(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.sub(b);

        // Assert
        assertEquals(Double.NaN, result.getImag(), 0.1);
    }
}