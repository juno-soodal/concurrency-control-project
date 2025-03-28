package com.example.concurrencycontrolproject.seat.serviceTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // Mockito 확장 사용
public class SeatServiceTest {

	// @Mock
	// private SeatRepository seatRepository; // Mock 객체 생성
	//
	// @InjectMocks
	// private SeatService seatService; // 테스트할 서비스 객체
	//
	// private Seat seat;
	//
	// @BeforeEach
	// void setUp() {
	// 	seat = new Seat(1L, 1, "VIP", 100000, "A구역");
	// }
	//
	// @Test
	// void testCreateSeat_Success() {
	// 	// Given (SeatRequest 설정)
	// 	SeatRequest requestDTO = new SeatRequest(1, "VIP", 100000, "A구역");
	//
	// 	// Stub 설정 (seatRepository.save()가 실행되면 seat 반환)
	// 	when(seatRepository.save(any(Seat.class))).thenReturn(seat);
	//
	// 	// When (서비스 메서드 호출)
	// 	Response<SeatResponse> response = seatService.createSeat(requestDTO);
	//
	// 	// Then (검증)
	// 	assertThat(response.getData()).isNotNull();
	// 	assertThat(response.getData().getId()).isEqualTo(1L);
	// 	assertThat(response.getData().getNumber()).isEqualTo(1);
	// 	assertThat(response.getData().getGrade()).isEqualTo("VIP");
	// 	assertThat(response.getData().getPrice()).isEqualTo(100000);
	// 	assertThat(response.getData().getSection()).isEqualTo("A구역");
	//
	// 	// seatRepository.save()가 1번 호출되었는지 검증
	// 	verify(seatRepository, times(1)).save(any(Seat.class));
	// }
	//
	// @Test
	// void testCreateSeat_Fail_WhenInvalidData() {
	// 	// Given: 잘못된 SeatRequest (음수 값)
	// 	SeatRequest requestDTO = new SeatRequest(-1, "VIP", -50000, "A구역");
	//
	// 	// When & Then
	// 	SeatException exception = assertThrows(
	// 		SeatException.class,
	// 		() -> seatService.createSeat(requestDTO)
	// 	);
	//
	// 	assertThat(exception.getMessage()).isEqualTo(SeatErrorCode.INVALID_SEAT_DATA.getDefaultMessage());
	// 	verify(seatRepository, never()).save(any(Seat.class));
	// }
	//
	// @Test
	// void testGetAllSeats_Success() {
	// 	// Given
	// 	int page = 0, size = 5;
	// 	List<Seat> seatList = IntStream.range(1, 6)
	// 		.mapToObj(i -> new Seat((long)i, i, "VIP", 100000, "A구역"))
	// 		.collect(Collectors.toList());
	// 	Page<Seat> seatPage = new PageImpl<>(seatList, PageRequest.of(page, size), seatList.size());
	//
	// 	when(seatRepository.findAll(any(Pageable.class))).thenReturn(seatPage);
	//
	// 	// When
	// 	Response<PageResponse<SeatResponse>> response = seatService.getAllSeats(page, size);
	//
	// 	// Then
	// 	assertThat(response.getData()).isNotNull();
	// 	assertThat(response.getData().getData()).hasSameClassAs(5);
	// 	assertThat(response.getData().getTotalPages()).isEqualTo(1);
	// 	assertThat(response.getData().getTotalElements()).isEqualTo(5);
	//
	// 	// seatRepository.findAll()이 1번 호출되었는지 검증
	// 	verify(seatRepository, times(1)).findAll(any(Pageable.class));
	// }
}
