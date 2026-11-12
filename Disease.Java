public class Disease {

 // instance variables for beverage superclass
  private String name;
  private String symptom1;
  private String symptom2;


   /*
     * Parameterize constructor (name, symptom, symptom2)
     */
  public Disease(String name, String symptom1, String symptom2) {
    this.name = name;
    this.symptom1 = symptom1;
    this.symptom2 = symptom2;
  }

   /*
     * get method for name
     */
  public String getName() {
    return name;
  }

   /*
     * get method for symptom 1
     */
  public String getSymptom1() {
    return symptom1;
  }

   /*
     * get method for symptom 2
     */
  public String getSymptom2() {
   return symptom2;
  }

    /*
     * toString method
     */
  public String toString() {
    return name + " - Symptoms: " + symptom1 + ", " + symptom2;
  }
}
