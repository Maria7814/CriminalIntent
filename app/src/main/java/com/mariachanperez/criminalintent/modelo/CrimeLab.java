package com.mariachanperez.criminalintent.modelo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;


    public static CrimeLab get(Context context ){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return  sCrimeLab;
    }

    private CrimeLab(Context contexto){
        mCrimes = new ArrayList<>();
        /*
        for (int i = 0; i < 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime #" + (i+1));
            crime.setSolved(i%2 == 0);
            mCrimes.add(crime);
        }
         */

    }

    public List<Crime> getmCrimes(){
        return mCrimes;
    }

    public void addCrime (Crime c) {

        mCrimes.add(c);
    }

    public Crime getCrime (UUID id){
        for (Crime crime: mCrimes){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

}
