package edu.kit.kastel.vads.compiler.backend.aasm;

import edu.kit.kastel.vads.compiler.backend.regalloc.Register;

public record VirtualRegister(int id) implements Register {
    @Override
    public String toString() {
        return "%" + getRegisterID(id);
    }

    //let's be lazy here and just return the three register ebx, ecx and edx for now.
    //Replace later with code that remembers reg states and libve values, but not tonight
    private String getRegisterID(int id){
        switch (id) {
            case 0: return "ebx";
            case 1: return "ecx";
            case 2: return "edx";
        }
        return  "" + id();
    }

}
