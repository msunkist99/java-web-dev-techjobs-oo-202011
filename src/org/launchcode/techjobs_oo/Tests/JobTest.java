package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
//    Job jobOne = new Job();
//    Job jobTwo = new Job();

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        //this may fail if other tests runs before testSettingJobId
        assertEquals(13, jobOne.getId(), 0);
        assertEquals(14, jobTwo.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //assertEquals(1, job.getId());
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

        assertTrue( job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        //assertEquals(1, job.getEmployer().getId());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        //assertEquals(1, job.getLocation().getId());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        //assertEquals(1, job.getPositionType().getId());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        //assertEquals(1,job.getCoreCompetency().getId());
    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertFalse(jobOne.equals(jobTwo));

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobThree.equals(jobFour));
    }

    @Test
    public void testJobsToString(){
        Job jobFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));

        assertEquals("\nID: " + jobFive.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistance", jobFive.toString());

        Job jobSixA = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));

        assertEquals("\nID: " + jobSixA.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistance", jobSixA.toString());

        Job jobSixB = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));

        assertEquals("\nID: " + jobSixB.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistance", jobSixB.toString());

        Job jobSixC = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistance"));

        assertEquals("\nID: " + jobSixC.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistance", jobSixC.toString());

        Job jobSixD = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistance"));

        assertEquals("\nID: " + jobSixD.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Persistance", jobSixD.toString());

        Job jobSixE = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));

        assertEquals("\nID: " + jobSixE.getId() + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Data not available", jobSixE.toString());

        Job jobSeven = new Job();
        assertEquals("\nOOPS! This job does not seem to exist.", jobSeven.toString());


    }
}
