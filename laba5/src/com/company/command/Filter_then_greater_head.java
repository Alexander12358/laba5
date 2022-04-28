package com.company.command;

import com.company.common.DragonList;
import com.company.common.Input;
import com.company.interfaces.Command;
import com.company.model.Dragon;
import com.company.model.DragonHead;

public class Filter_then_greater_head extends Command {
    @Override
    public void Run(String[] args) {
        DragonHead head = Input.getHead();
        for (String key : DragonList.getDragonsKeys()) {
            Dragon curr = DragonList.get(key);
            if (curr.getHead().compareTo(head) > 0) {
                System.out.println(curr);
            }
        }
    }
}
