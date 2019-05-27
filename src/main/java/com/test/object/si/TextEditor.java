package com.test.object.si;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
