package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A class used for testing Complex class methods of Division and Subtraction
 * @author Nikolay Dik
 */
class ComplexTest {

    /**
     * Division operation simple test for Real part.
     * @arrange Any Complex numbers a and b
     * @act a / b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation simple test for Imaginary part.
     * @arrange Any Complex numbers a and b
     * @act a / b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Real part with negative params.
     * @arrange Any Complex numbers a and b with negative params
     * @act a / b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Imaginary part with negative params.
     * @arrange Any Complex numbers a and b with negative params
     * @act a / b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Real part with zero params.
     * @arrange Any Complex numbers a and b with zero params
     * @act a / b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Imaginary part with zero params.
     * @arrange Any Complex numbers a and b with zero params
     * @act a / b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Real part with division by zero Complex.
     * @arrange Any Complex number a and zero Complex b
     * @act a / b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Imaginary part with division by zero Complex.
     * @arrange Any Complex number a and zero Complex b
     * @act a / b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Real part with division by Positive and Negative Infinities.
     * @arrange Any Complex numbers a and b with infinity params
     * @act a / b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Division operation test for Imaginary part with division by Positive and Negative Infinities.
     * @arrange Any Complex numbers a and b with infinity params
     * @act a / b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation simple test for Real part.
     * @arrange Any Complex numbers a and b
     * @act a - b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation simple test for Imaginary part.
     * @arrange Any Complex numbers a and b
     * @act a - b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Real part with Negative params.
     * @arrange Any Complex numbers a and b with Negative params
     * @act a - b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Imaginary part with Negative params.
     * @arrange Any Complex numbers a and b with Negative params
     * @act a - b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Real part with zero params.
     * @arrange Any Complex numbers a and b with zero params
     * @act a - b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Imaginary part with zero params.
     * @arrange Any Complex numbers a and b with zero params
     * @act a - b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Real part with Infinity params.
     * @arrange Any Complex numbers a and b with Infinity params
     * @act a - b
     * @assert Checks Real part of Complex
     * @author Nikolay Dik
     */
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

    /**
     * Subtraction operation test for Imaginary part with Infinity params.
     * @arrange Any Complex numbers a and b with Infinity params
     * @act a - b
     * @assert Checks Imaginary part of Complex
     * @author Nikolay Dik
     */
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