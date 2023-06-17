package com.example.fitnesstracker;

public class LocalUserData
{
    public enum ExerciseLevel {
        SEDENTARY,
        LIGHT,
        MODERATE,
        ACTIVE,
        VERY_ACTIVE,
        EXTREMELY_ACTIVE
    }

    public enum Gender {
        MALE,
        FEMALE
    }

    boolean isReturningUser;
    double bodyWeight, height, age;
    Gender maleOrFemale = null;
    ExerciseLevel exerciseLevel = null;

    public LocalUserData() {
        // Default constructor required for calls to DataSnapshot.getValue(TestClass.class)
    }

    public LocalUserData(double bodyWeight, double height, double age, Gender maleOrFemale, ExerciseLevel exerciseLevel) {
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;
        this.maleOrFemale = maleOrFemale;
        this.exerciseLevel = exerciseLevel;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Gender getMaleOrFemale() {
        return maleOrFemale;
    }

    public void setMaleOrFemale(Gender maleOrFemale) {
        this.maleOrFemale = maleOrFemale;
    }

    public ExerciseLevel getExerciseLevel() {
        return exerciseLevel;
    }

    public void setExerciseLevel(ExerciseLevel exerciseLevel) {
        this.exerciseLevel = exerciseLevel;
    }

    public boolean isReturningUser() {
        return isReturningUser;
    }

    public void setReturningUser(boolean returningUser) {
        isReturningUser = returningUser;
    }
}
