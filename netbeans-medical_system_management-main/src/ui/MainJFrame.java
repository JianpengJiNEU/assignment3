/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import medicalsystem.City;
import medicalsystem.Community;
import medicalsystem.Doctor;
import medicalsystem.DoctorDirectory;
import medicalsystem.Encounter;
import medicalsystem.EncounterHistory;
import medicalsystem.MedicalSystem;
import medicalsystem.Patient;
import medicalsystem.PatientDirectory;
import medicalsystem.PersonDirectory;
import medicalsystem.User;
import medicalsystem.UserDirectory;
import medicalsystem.VitalSign;

/**
 *
 * @author TT
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    MedicalSystem admin;

    public MainJFrame() throws IOException {
        initComponents();

        admin = new MedicalSystem();
        PatientDirectory patientDirectory = admin.patientDirectory;
        PersonDirectory personDirectory = admin.persionDirectory;
        City city = admin.city;
        DoctorDirectory doctorDirectory = admin.doctorDirectory;
        UserDirectory userDirectory = admin.userDirectory;
        EncounterHistory encounterHistory = admin.encounterHistory;
//        patientDirectory = loadFromFile(patientDirectory); // load the cars information from the config file
        patientDirectory = createPatientDirectory(patientDirectory); // load the cars information from the config file
        city = createCity(city);
        personDirectory = createPerson(personDirectory);
        patientDirectory = randomCreatePatient(patientDirectory);
        doctorDirectory = createDoctorDirectory(doctorDirectory);
        userDirectory = createUserDirectory(userDirectory);
        encounterHistory = createEncounterHistory(encounterHistory);
        setSize(900, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnAdmin)
                .addContainerGap(546, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        AdminSystemJPanel adminSystem = new AdminSystemJPanel(userProcessContainer, admin);
        userProcessContainer.add("AdminSystemJPanel", adminSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    private PatientDirectory loadFromFile(PatientDirectory patientDirectory) throws FileNotFoundException, IOException {

        ////////////////// load patient from configuration file ////////////////
        Properties patientConfig = new Properties();
        String filePath = "src/files/personConfig.properties";
        patientConfig.load(new BufferedReader(new FileReader(filePath)));

        for (int i = 1; i <= 3; i++) {

            String patientHead = "person" + i + "_";
            String patientId = patientConfig.getProperty(patientHead + "id");
            String patientAge = patientConfig.getProperty(patientHead + "age");
            String patientFirstName = patientConfig.getProperty(patientHead + "firstName");
            String patientLastName = patientConfig.getProperty(patientHead + "lastName");
            String patientResidenceId = patientConfig.getProperty(patientHead + "residenceId");
            String patientCommunityId = patientConfig.getProperty(patientHead + "communityId");

            Patient patient = new Patient(Integer.parseInt(patientId), Integer.parseInt(patientAge), patientFirstName, patientLastName, Integer.parseInt(patientResidenceId), Integer.parseInt(patientCommunityId));
            EncounterHistory eh = patient.getEncounterHistory();

            for (int j = 1; j <= 10; j++) {
                String encounterHead = patientHead + j + "_";
                String encounterId = patientConfig.getProperty(encounterHead + "encounterid");
                if (encounterId == null) {
                    break;
                }
                String doctorId = patientConfig.getProperty(encounterHead + "doctorId");
                String highPressure = patientConfig.getProperty(encounterHead + "highPressure");
                String lowPressure = patientConfig.getProperty(encounterHead + "lowPressure");

                eh.addEncounter(Integer.parseInt(highPressure), Integer.parseInt(lowPressure), encounterId, Integer.parseInt(doctorId),0);
            }

            patientDirectory.addPatient(patient);
        }

        return patientDirectory;

    }

    private City createCity(City city) {
        city.setCityId(1);
        city.setCityName("Boston");
        Community c1 = new Community(1, "community1");
        Community c2 = new Community(2, "community2");
        Community c3 = new Community(3, "community3");
        city.addCommunity(c1);
        city.addCommunity(c2);
        city.addCommunity(c3);
        return city;
    }

    private PersonDirectory createPerson(PersonDirectory personDirectory) throws FileNotFoundException, IOException {
        Properties personConfig = new Properties();
        String filePath = "src/files/personConfig.properties";
        personConfig.load(new BufferedReader(new FileReader(filePath)));

        for (int i = 1; i <= 5; i++) {
            String personHead = "person" + i + "_";
            int id = Integer.parseInt(personConfig.getProperty(personHead + "id"));
            int age = Integer.parseInt(personConfig.getProperty(personHead + "age"));
            int residenceId = Integer.parseInt(personConfig.getProperty(personHead + "residenceId"));
            int communityId = Integer.parseInt(personConfig.getProperty(personHead + "communityId"));
            String firstName = personConfig.getProperty(personHead + "firstName");
            String lastName = personConfig.getProperty(personHead + "lastName");
            String position = personConfig.getProperty(personHead + "position");

            personDirectory.addPerson(id, age, firstName, lastName, residenceId, communityId, position);

        }
        return personDirectory;
    }

    private PatientDirectory randomCreatePatient(PatientDirectory patientDirectory) {

        for (int i = 4; i <= 600; i++) {

            int patientId = 100000 + i;
            int patientAge = (int) (Math.random() * 99 + 1);
            String patientFirstName = getRandomName((int) (Math.random() * 4 + 3));
            String patientLastName = getRandomName((int) (Math.random() * 4 + 3));
            int patientResidenceId = (int) (Math.random() * 9999 + 1);
            int patientCommunityId = (int) (Math.random() * 3 + 1);

            Patient patient = new Patient(patientId, patientAge, patientFirstName, patientLastName, patientResidenceId, patientCommunityId);

            EncounterHistory eh = patient.getEncounterHistory();

            for (int j = 1; j <= 4; j++) {
                int encounterId = 20210000 + ((int) (Math.random() * 12 + 1)) * 100 + (int) (Math.random() * 30 + 1);
                int doctorId = 1000 + (int) (Math.random() * 5 + 1);
                //int highPressure = ((int)(Math.random()*2 + 1))*2 + 139;
                //int lowPressure = ((int)(Math.random()*2 + 1))*2 + 89;
                int highPressure = (int) (Math.random() * 71 + 80);
                int lowPressure = (int) (Math.random() * 41 + 55);

                eh.addEncounter(highPressure, lowPressure, encounterId + "", doctorId,0);
            }
            patientDirectory.addPatient(patient);
        }
        return patientDirectory;
    }

    private String getRandomName(int i) {
        String str = "";
        for (int j = 0; j < i; j++) {
            str = str + (char) (Math.random() * 26 + 'a');
        }
        return str;
    }

    public UserDirectory createUserDirectory(UserDirectory userDirectory) {
        BufferedReader fileReader = null;
        try {
            String line = "";

            //Create the file reader
            fileReader = new BufferedReader(new FileReader("src/files/users.csv"));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    //Create a new user object and fill his  data
                    userDirectory.addUser(new User(tokens[0], tokens[1], tokens[2], tokens[3]));

                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return userDirectory;
    }

    private PatientDirectory createPatientDirectory(PatientDirectory patientDirectory) throws FileNotFoundException, IOException {
        BufferedReader fileReader = null;
        try {
            String line = "";

            //Create the file reader
            fileReader = new BufferedReader(new FileReader("src/files/patients.csv"));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    //Create a new patient object and fill his  data
                    Patient patient = new Patient(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
                    patient.setAge(Integer.parseInt(tokens[3]));
                    patientDirectory.addPatient(patient);

                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return patientDirectory;
    }

    private EncounterHistory createEncounterHistory(EncounterHistory encounterHistory) {
        BufferedReader fileReader = null;
        try {
            //Create a new list of encounterHistory to be filled by CSV file data 

            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader("src/files/encounterHistory.csv"));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(",");
                if (tokens.length >=9) {
                    //Create a new encounterHistory object and fill his  data
                   
                    VitalSign vital = new VitalSign((int)Double.parseDouble(tokens[3]), (int)Double.parseDouble(tokens[4]), Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]));
                    Encounter encounter = new Encounter(tokens[0],tokens[8], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), vital);
                    encounterHistory.addEncounter(encounter);

                }
            }

        } catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return encounterHistory;
    }

    private DoctorDirectory createDoctorDirectory(DoctorDirectory doctorDirectory) {
        BufferedReader fileReader = null;
        try {
            //Create a new list of doctor to be filled by CSV file data 

            String line = "";

            //Create the file reader
            fileReader = new BufferedReader(new FileReader("src/files/doctors.csv"));

            //Read the CSV file header to skip it
            fileReader.readLine();

            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    //Create a new doctor object and fill his  data
                    Doctor doctor = new Doctor(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
                    doctor.setHospitalName(tokens[3]);
                    doctor.setMedicalDepartment(tokens[4]);
                    doctor.setYearsOfExperience(Integer.parseInt(tokens[5]));
                    doctor.setAge(Integer.parseInt(tokens[5]));
                    doctor.setCommunity(tokens[7]);
                    doctorDirectory.addDoctor(doctor);
                  
                }
            }

        } catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }
        return doctorDirectory;

    }

}