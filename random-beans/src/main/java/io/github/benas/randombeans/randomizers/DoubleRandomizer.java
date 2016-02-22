/*
 * The MIT License
 *
 *   Copyright (c) 2016, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package io.github.benas.randombeans.randomizers;

/**
 * Generate a random {@link Double}.
 *
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public class DoubleRandomizer extends AbstractRandomizer<Double> {

    /**
     * Create a new {@link DoubleRandomizer}.
     */
    public DoubleRandomizer() {
    }

    /**
     * Create a new {@link DoubleRandomizer}.
     *
     * @param seed initial seed
     */
    public DoubleRandomizer(final long seed) {
        super(seed);
    }

    /**
     * Create a new {@link DoubleRandomizer}.
     *
     * @return a new {@link DoubleRandomizer}.
     */
    public static DoubleRandomizer aNewDoubleRandomizer() {
        return new DoubleRandomizer();
    }

    /**
     * Create a new {@link DoubleRandomizer}.
     *
     * @param seed initial seed
     * @return a new {@link DoubleRandomizer}.
     */
    public static DoubleRandomizer aNewDoubleRandomizer(final long seed) {
        return new DoubleRandomizer(seed);
    }
    
    @Override
    public Double getRandomValue() {
        return random.nextDouble();
    }
}