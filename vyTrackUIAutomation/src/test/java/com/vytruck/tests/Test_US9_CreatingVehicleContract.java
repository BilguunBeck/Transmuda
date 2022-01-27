package com.vytruck.tests;

import com.vytruck.pages.CreateContractPage;
import com.vytruck.pages.VehicleContractPage;
import com.vytruck.utilities.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_US9_CreatingVehicleContract extends TestBase {


    //Store Manager AC1
    @Test
    public void storeManagerUsername1Test() {

            VehicleContractPage _vehicleContractPage = new VehicleContractPage();
            CreateContractPage _createContractPage = new CreateContractPage();



            _vehicleContractPage.getToDestination("storeManagerUsername1");
            _vehicleContractPage.printUserName();
            _vehicleContractPage.goToContractPage();
            assertTrue(_vehicleContractPage.atAllContractPage());
            _vehicleContractPage.checkUncheckAll();
            _createContractPage.StartContract();

            _createContractPage.invoiceSignDate(7,13,"2021");
            _createContractPage.startFrom(1,22,"2021");
            _createContractPage.endsOnDate(2,16,"2021");

             _createContractPage.InsertData();

             /**
             * You can choose any of the following cars
             * XF 2021, corolla, Model-X, m3
             */
            _createContractPage.addingCar("m3");

            /**
             * You can choose any of the following cars
             * DAF, Toyota, Tesla, mazda
             */
             _createContractPage.choosingCarMake("mazda");
             assertTrue(_createContractPage.saveAndConfirm());
        }

    @Test
    public void storeManagerUsername2Test() {

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();
        CreateContractPage _createContractPage = new CreateContractPage();



        _vehicleContractPage.getToDestination("storeManagerUsername2");
        _vehicleContractPage.printUserName();
        _vehicleContractPage.goToContractPage();
        assertTrue(_vehicleContractPage.atAllContractPage());
        _vehicleContractPage.checkUncheckAll();
        _createContractPage.StartContract();


        _createContractPage.invoiceSignDate(6,24,"2021");
        _createContractPage.startFrom(2,13,"2021");
        _createContractPage.endsOnDate(7,10,"2021");

        _createContractPage.InsertData();

        /**
         * You can choose any of the following cars
         * XF 2021, corolla, Model-X, m3
         */
        _createContractPage.addingCar("m3");

        /**
         * You can choose any of the following cars
         * DAF, Toyota, Tesla, mazda
         */
        _createContractPage.choosingCarMake("mazda");
        assertTrue(_createContractPage.saveAndConfirm());
    }

    @Test
    public void storeManagerUsername3Test() {

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();
        CreateContractPage _createContractPage = new CreateContractPage();



        _vehicleContractPage.getToDestination("storeManagerUsername3");
        _vehicleContractPage.printUserName();
        _vehicleContractPage.goToContractPage();
        assertTrue(_vehicleContractPage.atAllContractPage());
        _vehicleContractPage.checkUncheckAll();
        _createContractPage.StartContract();


        _createContractPage.invoiceSignDate(3,9,"2007");
        _createContractPage.startFrom(9,17,"2007");
        _createContractPage.endsOnDate(11,10,"2007");

        _createContractPage.InsertData();

        /**
         * You can choose any of the following cars
         * XF 2021, corolla, Model-X, m3
         */
        _createContractPage.addingCar("m3");

        /**
         * You can choose any of the following cars
         * DAF, Toyota, Tesla, mazda
         */
        _createContractPage.choosingCarMake("mazda");
        assertTrue(_createContractPage.saveAndConfirm());
    }



    //Sales Manager  AC1
    @Test
    public void salesManagerUsername1Test() {

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();
        CreateContractPage _createContractPage = new CreateContractPage();



        _vehicleContractPage.getToDestination("salesManagerUsername1");
        _vehicleContractPage.printUserName();
        _vehicleContractPage.goToContractPage();
        assertTrue(_vehicleContractPage.atAllContractPage());
        _vehicleContractPage.checkUncheckAll();
        _createContractPage.StartContract();

        _createContractPage.invoiceSignDate(0,2,"2021");
        _createContractPage.startFrom(1,2,"2021");
        _createContractPage.endsOnDate(1,16,"2021");

        _createContractPage.InsertData();

        /**
         * You can choose any of the following cars
         * XF 2021, corolla, Model-X, m3
         */
        _createContractPage.addingCar("m3");

        /**
         * You can choose any of the following cars
         * DAF, Toyota, Tesla, mazda
         */
        _createContractPage.choosingCarMake("mazda");
        assertTrue(_createContractPage.saveAndConfirm());
    }

    @Test
    public void salesManagerUsername2Test() {

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();
        CreateContractPage _createContractPage = new CreateContractPage();



        _vehicleContractPage.getToDestination("salesManagerUsername2");
        _vehicleContractPage.printUserName();
        _vehicleContractPage.goToContractPage();
        assertTrue(_vehicleContractPage.atAllContractPage());
        _vehicleContractPage.checkUncheckAll();
        _createContractPage.StartContract();


        _createContractPage.invoiceSignDate(7,9,"2011");
        _createContractPage.startFrom(10,20,"2011");
        _createContractPage.endsOnDate(11,5,"2011");

        _createContractPage.InsertData();

        /**
         * You can choose any of the following cars
         * XF 2021, corolla, Model-X, m3
         */
        _createContractPage.addingCar("m3");

        /**
         * You can choose any of the following cars
         * DAF, Toyota, Tesla, mazda
         */
        _createContractPage.choosingCarMake("mazda");
        assertTrue(_createContractPage.saveAndConfirm());
    }

    @Test
    public void salesManagerUsername3Test() {

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();
        CreateContractPage _createContractPage = new CreateContractPage();



        _vehicleContractPage.getToDestination("salesManagerUsername3");
        _vehicleContractPage.printUserName();
        _vehicleContractPage.goToContractPage();
        assertTrue(_vehicleContractPage.atAllContractPage());
        _vehicleContractPage.checkUncheckAll();
        _createContractPage.StartContract();


        _createContractPage.invoiceSignDate(2,2,"2021");
        _createContractPage.startFrom(7,21,"2021");
        _createContractPage.endsOnDate(9,16,"2021");

        _createContractPage.InsertData();

        /**
         * You can choose any of the following cars
         * XF 2021, corolla, Model-X, m3
         */
        _createContractPage.addingCar("m3");

        /**
         * You can choose any of the following cars
         * DAF, Toyota, Tesla, mazda
         */
        _createContractPage.choosingCarMake("mazda");
        assertTrue(_createContractPage.saveAndConfirm());
    }



    //Driver   AC2

    @Test
    public void truckDriversUsername1(){

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();

        _vehicleContractPage.getToDestination("truckDriversUsername1");
        _vehicleContractPage.printUserName();
        assertTrue(_vehicleContractPage.driverToContractPage());

    }


    @Test
    public void truckDriversUsername2(){

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();

        _vehicleContractPage.getToDestination("truckDriversUsername2");
        _vehicleContractPage.printUserName();
        assertTrue(_vehicleContractPage.driverToContractPage());

    }


    @Test
    public void truckDriversUsername3(){

        VehicleContractPage _vehicleContractPage = new VehicleContractPage();

        _vehicleContractPage.getToDestination("truckDriversUsername3");
        _vehicleContractPage.printUserName();
        assertTrue(_vehicleContractPage.driverToContractPage());

    }







}


