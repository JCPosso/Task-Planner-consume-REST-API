package com.example.introductiontoandroid.dto

class TasksDto {
    private var dueDate: String
    private var assignedTo: String
    private var status: String
    private var description: String
    private var name: String

    constructor(name: String, description: String, status: String, assignedTo: String, dueDate: String){
        this.name=name
        this.description=description
        this.status=status
        this.assignedTo=assignedTo
        this.dueDate=dueDate
    }

    override fun toString(): String {
        return "TasksDto(dueDate='$dueDate', assignedTo='$assignedTo', status='$status', description='$description', name='$name')"
    }
}