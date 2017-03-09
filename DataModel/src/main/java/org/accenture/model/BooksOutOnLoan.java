package org.accenture.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by antonio on 01/03/17.
 */

@Table
@Entity(name = "books_out_on_loan")
public class BooksOutOnLoan {

    @Id
    @Column(name="idBookBorrowing")
    private int idBookBorrowing;

    @Column(name="borrowerStudent_id")
    private int borrowerStudentId;

    @Column(name="isbn")
    private String isbn;

    @Column(name="data_issued")
    private Date dataIssued;

    @Column(name="data_due_for_return")
    private Date dataDueForReturn;

    @Column(name="data_returned")
    private Date dataReturned;

    @Column(name="amount_of_fine")
    private double amountOfFine;

    public int getIdBookBorrowing() {
        return idBookBorrowing;
    }

    public void setIdBookBorrowing(int idBookBorrowing) {
        this.idBookBorrowing = idBookBorrowing;
    }

    public int getBorrowerStudentId() {
        return borrowerStudentId;
    }

    public void setBorrowerStudentId(int borrowerStudentId) {
        this.borrowerStudentId = borrowerStudentId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getDataIssued() {
        return dataIssued;
    }

    public void setDataIssued(Date dataIssued) {
        this.dataIssued = dataIssued;
    }

    public Date getDataDueForReturn() {
        return dataDueForReturn;
    }

    public void setDataDueForReturn(Date dataDueForReturn) {
        this.dataDueForReturn = dataDueForReturn;
    }

    public Date getDataReturned() {
        return dataReturned;
    }

    public void setDataReturned(Date dataReturned) {
        this.dataReturned = dataReturned;
    }

    public double getAmountOfFine() {
        return amountOfFine;
    }

    public void setAmountOfFine(double amountOfFine) {
        this.amountOfFine = amountOfFine;
    }
}
