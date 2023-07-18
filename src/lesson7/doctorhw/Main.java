package lesson7.doctorhw;

public class Main
{
    static Doctor surgeon = new Surgeon();
    static Doctor therapist = new Therapist();
    static Doctor dentist = new Dentist();

    public static void main(String[] args)
    {
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan();
        patient.setTreatmentPlan(treatmentPlan);
        patient.setName("Ivan");
        findDoctor(patient);
    }

    public static void findDoctor(Patient patient)
    {
        if (patient.getTreatmentPlan() != null)
        {
            switch (patient.getTreatmentPlan().getCode())
            {
                case 1:
                    patient.getTreatmentPlan().setDoctor(surgeon);
                    surgeon.treat();
                    break;
                case 2:
                    patient.getTreatmentPlan().setDoctor(dentist);
                    dentist.treat();
                    break;
                default:
                    patient.getTreatmentPlan().setDoctor(therapist);
                    therapist.treat();
                    break;
            }
        }
        else
        {
            System.out.println("Error, plan not found");
        }
    }
}
