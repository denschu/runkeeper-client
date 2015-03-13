package de.denschu.runkeeper.transformer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.denschu.runkeeper.domain.NewFitnessActivity;

public class TcxTransformerTest {

	@Test
	public void transform() throws JAXBException, JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		// Given
		TcxTransformer transformer = new TcxTransformer();
		File file = new File("src/test/resources/example.tcx");
		// When
		NewFitnessActivity activity = transformer.transform(file);
		// Then
		Assert.assertNotNull(activity);
		Assert.assertNotNull(activity.getType());
		new ObjectMapper().writeValue(new FileOutputStream("target/tcx.json"), activity);
	}
}
