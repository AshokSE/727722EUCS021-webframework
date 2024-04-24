package com.examly.springapp.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.ashokmodel.ashokDoor;
import com.examly.springapp.ashokrepository.ashokDoorRepo;

@Service
public class ashokDoorService {
    @Autowired
    private ashokDoorRepo doorRepo;

    public ashokDoor postData(ashokDoor door) {
        return doorRepo.save(door);
    }

    public List<ashokDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public ashokDoor updateDetail(int doorid, ashokDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<ashokDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<ashokDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public ashokDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}