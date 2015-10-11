/*package cs1530.osgfreesurfer.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@AutoConfigureAfter(DispatcherServletAutoConfiguration.class)
public class CustomConfiguration extends
                    WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    String myExternalFilePath = "file:/";

    registry.addResourceHandler("/m/**").addResourceLocations(myExternalFilePath);

    super.addResourceHandlers(registry);
  }

}*/