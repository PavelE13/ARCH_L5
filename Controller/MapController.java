package Controller;

import LocalData.ITripHistory;
import WebData.ICamerasRepository;
import WebData.ICityObjectRepository;
import WebData.ICurrentTraficRepository;
import WebData.IRoadsRepository;

public class MapController extends TripController {
    private final ICityObjectRepository iCityObjectRepository;

    public MapController(ITripHistory iTripHistory, IRoadsRepository iRoadsRepository, ICurrentTraficRepository iCurrentTraficRepository,
                         ICamerasRepository iCamerasRepository, ICityObjectRepository iCityObjectRepository) {
        super(iTripHistory, iRoadsRepository, iCurrentTraficRepository,iCamerasRepository);
        this.iCityObjectRepository = iCityObjectRepository;
    }
}
