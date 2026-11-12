public class UserStory {

// 1d array of diseaseData objects
  private Disease[] diseaseData;

 /*
   * Reads the data from nameFile and
   * symptom files to initialize diseasesData
   */
  public UserStory(String nameFile, String symptomFile1, String symptomFile2) {
    diseaseData = createPatient(nameFile, symptomFile1, symptomFile2);
  }

   /*
   * Returns a 1D array of Disease objects using
   * the data from nameFile and symptom files
   */
  public Disease[] createPatient(String nameFile, String symptomFile1, String symptomFile2) {

    String[] namesData = FileReader.toStringArray(nameFile);
    String[] symptomsData1 = FileReader.toStringArray(symptomFile1);
    String[] symptomsData2 = FileReader.toStringArray(symptomFile2);

    Disease[] tempDiseases = new Disease[namesData.length];

    for (int index = 0; index < tempDiseases.length; index++) {
      tempDiseases[index] = new Disease(
        namesData[index],
        symptomsData1[index],
        symptomsData2[index]
      );
}

    return tempDiseases;
}

  /*
   * Returns the disease chosen through user input
   * and symptoms that correlate with the chosen disease
   */
 public void checkSpecificDisease(String chosen) {

  for (int i = 0; i < diseaseData.length; i++) {

    if (diseaseData[i].getName().equals(chosen)) {

      String symptom1 = diseaseData[i].getSymptom1();      
      String symptom2 = diseaseData[i].getSymptom2();

      System.out.println("Disease: " + chosen);
      System.out.println("Symptom 1: " + symptom1);
      System.out.println("Symptom 2: " + symptom2);

      return;
    }
  }
   
// prints if user input does not match
  System.out.println("Disease not found.");
}


    /*
     * toString method
     */
  public String toString() {
    String result = "";

    for (Disease d : diseaseData) {
      result += d + "\n";
    }

    return result;
}
}
