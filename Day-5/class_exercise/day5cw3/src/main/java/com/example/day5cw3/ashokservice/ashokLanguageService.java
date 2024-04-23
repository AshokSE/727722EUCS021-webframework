package com.example.day5cw3.ashokservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.ashokmodel.ashokLanguage;
import com.example.day5cw3.ashokrepository.ashokLanguageRepo;

@Service
public class ashokLanguageService {
    private ashokLanguageRepo languageRepo;
    public ashokLanguageService(ashokLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(ashokLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ashokLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,ashokLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public ashokLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
