package com.aaront.exercise.jvm.index;

/**
 * @author tonyhui
 * @since 17/6/6
 */
public class ClassIndex {
    private int thisClassIndex;
    private int superClassIndex;

    public ClassIndex() {
    }

    public ClassIndex(int thisClassIndex, int superClassIndex) {
        this.thisClassIndex = thisClassIndex;
        this.superClassIndex = superClassIndex;
    }

    public int getThisClassIndex() {
        return thisClassIndex;
    }
    public void setThisClassIndex(int thisClassIndex) {
        this.thisClassIndex = thisClassIndex;
    }
    public int getSuperClassIndex() {
        return superClassIndex;
    }
    public void setSuperClassIndex(int superClassIndex) {
        this.superClassIndex = superClassIndex;
    }
}