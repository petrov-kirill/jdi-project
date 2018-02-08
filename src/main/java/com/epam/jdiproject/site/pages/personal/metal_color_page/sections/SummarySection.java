package com.epam.jdiproject.site.pages.personal.metal_color_page.sections;


import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdiproject.entities.SummaryFormData;
import com.epam.jdiproject.site.pages.personal.metal_color_page.forms.SummaryForm;
import ru.yandex.qatools.allure.annotations.Step;

public class SummarySection extends Section {

    SummaryForm summaryForm;

    @Step
    public void checkSummaryFormRadios(SummaryFormData data) {
        summaryForm.submit(data);
    }
}
