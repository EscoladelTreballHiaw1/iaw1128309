/**
 * Class person 24/2/2016
 * Gio Mikee Plata Justiniano
 * 
 */

package bicycle;

public class Person {
    // Name
    private String name;
    // Age
    private int age;
    // Height
    private double height;
    // Sex (M / W)
    private char sex;
    // Married or not
    private boolean married;
    /** Person's bike */
    private Bicycle bike;
    
    // Constructors
    
    /**
     * Default constructor
     */
    public Person() {
        this.married = true;
    }
    /**
     * Constructor
     * 
     * @param name the person's name.
     */
    public Person(String name) {
        this.name = name;
    }
    
    /**
     * Constructor
     * 
     * @param name the person's name
     * @param age the person's age
     * @param height the person's height
     * @param sex the person's sex. It can be 'M' man or 'W' (woman)
     * @param married true if the person is married, false otherwise
     */
    public Person(String name, int age, double height, char sex, boolean married) {
        this.name = name;
        //this.age = age;
        this.setAge(age);
        this.height = height;
        this.sex = sex;
        this.married = married;
    }
    
    /**
     * 
     * @return the person's name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Sets the person's name.
     * 
     * @param name the person's name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets person's age
     * 
     * @return the person's age
     */
    public int getAge() {
        return this.age;
    }
    
    /**
     * Sets the person's age
     * 
     * @param age the person's age;
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Gets the person's height
     * 
     * @return height the person's height
     */
    public double getHeight() {
        return this.height;
    }
    
    /**
     * Sets the person's height
     * 
     * @param height the person's height
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Gets the person's sex
     * 
     * @return the person's sex
     */
    public char getSex() {
        return this.sex;
    }
    
    /**
     * Set the person's sex
     * 
     * @param the person's sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }
    
    /**
     * Gets the person's marital status
     * 
     * @return the value of the boolean variable married
     */
    public boolean getMarried() {
        return this.married;
    }
    
    /**
     * Sets the person's marital status
     * 
     * @param married set true if married false otherwise
     */
    public void setMarried(boolean married) {
        this.married = married;
    }
    
    /**
     * Increases person's age by 1
     */
    public void birthday() {
        this.age++;
    }
    
    /**
     * Create a string of the person's information
     * 
     * @return the information of the person in string
     */
    public String toString() {
        return "[ " + this.name + ", " + this.age + ", " + this.height + ", " + this.sex + ", " + this.married + " ]";
    }
}