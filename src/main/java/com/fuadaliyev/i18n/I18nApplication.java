package com.fuadaliyev.i18n;

import com.fuadaliyev.i18n.service.InternalizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.fuadaliyev.i18n.util.MessageConstants.LABELS_COST;

@SpringBootApplication
public class I18nApplication implements CommandLineRunner {
	@Autowired
	private InternalizationService internalizationService;

	public static void main(String[] args) {
		SpringApplication.run(I18nApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(internalizationService.testMessage(LABELS_COST, "aze"));
	}
}
