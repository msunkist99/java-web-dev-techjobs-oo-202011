package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job jobOne = new Job();
    Job jobTwo = new Job();

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId() {
//        Job jobOne = new Job();
//        Job jobTwo = new Job();

        //this may fail if the testJobConstructorSetsAllFields test runs before testSettingJobId
        assertEquals(1, jobOne.getId(), 0);
        assertEquals(2, jobTwo.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //assertEquals(1, job.getId());
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());

        assertTrue( job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals(1, job.getEmployer().getId());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals(1, job.getLocation().getId());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals(1, job.getPositionType().getId());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertEquals(1,job.getCoreCompetency().getId());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(jobOne.equals(jobTwo));

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobThree.equals(jobFour));
    }
}
