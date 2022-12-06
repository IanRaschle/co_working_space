package ch.zli.iraschle.controller;

import ch.zli.iraschle.model.booking.BookingEntity;
import ch.zli.iraschle.service.BookingsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

@Path("/bookings")
public class BookingsController {
    @Inject
    BookingsService bookingsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookingEntity> getBookings() {
        return Collections.emptyList();
    }
}
