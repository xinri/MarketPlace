import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class OfferShould {

  @Test
  public void 

  @Test
  public void return_description_when_get_the_description_after_offer_is_create_with_a_description() {
    Offer offer = new Offer("Hello World");
    assertThat(offer.getDescription()).isEqualsTo("Hello World");
  }
}
