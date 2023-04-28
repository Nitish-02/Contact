package com.apptad.contactdetails.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.apptad.contactdetails.entities.Contact;

public interface ExcelFileService {
	ByteArrayInputStream export(List<Contact> contacts);

}
