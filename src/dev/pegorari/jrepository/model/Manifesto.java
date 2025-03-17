package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Manifesto implements SankhyaEntity<Manifesto> {

   private String chaveMdfe;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private Timestamp dhEmiss;
   private Timestamp dhRecibo;
   private String nroRecibo;
   private BigDecimal numAleatorio;
   private BigDecimal numMdfe;
   private BigDecimal numViag;
   private BigDecimal seqMdfe;
   private String statusMdfe;
   private String tipEmiss;
   private BigDecimal ufFinal;
   private char[] xml;
   private BigDecimal codCidEncerramento;
   private String codPortoDestino;
   private String codPortoEmbarque;
   private String codPortoTransbordo;
   private String irInNavio;
   private String qrCode;
   private BigDecimal tipoNavegacao;
   private String usaPesoBrutoNfe;
   private BigDecimal pesoBrutoTot;
   private String unMed;
   private BigDecimal ufInicial;
   private char[] xmlEnvCli;
   private char[] xmlProtAut;
   private BigDecimal nuLoteMdfe;
   private String cepCar;
   private String cepDescar;
   private String descProd;
   private String ean;
   private BigDecimal latCar;
   private BigDecimal latDescar;
   private BigDecimal lonDesgCar;
   private BigDecimal longCar;
   private String ncm;
   private String tpCarga;
   private String indCarregPost;
   private BigDecimal munFinal;
   private BigDecimal munInicial;

   public String getChaveMdfe() {
        return chaveMdfe;
   }

   public void setChaveMdfe(String chaveMdfe) {
        this.chaveMdfe = chaveMdfe;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhEmiss() {
        return dhEmiss;
   }

   public void setDhEmiss(Timestamp dhEmiss) {
        this.dhEmiss = dhEmiss;
   }

   public Timestamp getDhRecibo() {
        return dhRecibo;
   }

   public void setDhRecibo(Timestamp dhRecibo) {
        this.dhRecibo = dhRecibo;
   }

   public String getNroRecibo() {
        return nroRecibo;
   }

   public void setNroRecibo(String nroRecibo) {
        this.nroRecibo = nroRecibo;
   }

   public BigDecimal getNumAleatorio() {
        return numAleatorio;
   }

   public void setNumAleatorio(BigDecimal numAleatorio) {
        this.numAleatorio = numAleatorio;
   }

   public BigDecimal getNumMdfe() {
        return numMdfe;
   }

   public void setNumMdfe(BigDecimal numMdfe) {
        this.numMdfe = numMdfe;
   }

   public BigDecimal getNumViag() {
        return numViag;
   }

   public void setNumViag(BigDecimal numViag) {
        this.numViag = numViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public String getStatusMdfe() {
        return statusMdfe;
   }

   public void setStatusMdfe(String statusMdfe) {
        this.statusMdfe = statusMdfe;
   }

   public String getTipEmiss() {
        return tipEmiss;
   }

   public void setTipEmiss(String tipEmiss) {
        this.tipEmiss = tipEmiss;
   }

   public BigDecimal getUfFinal() {
        return ufFinal;
   }

   public void setUfFinal(BigDecimal ufFinal) {
        this.ufFinal = ufFinal;
   }

   public char[] getXml() {
        return xml;
   }

   public void setXml(char[] xml) {
        this.xml = xml;
   }

   public BigDecimal getCodCidEncerramento() {
        return codCidEncerramento;
   }

   public void setCodCidEncerramento(BigDecimal codCidEncerramento) {
        this.codCidEncerramento = codCidEncerramento;
   }

   public String getCodPortoDestino() {
        return codPortoDestino;
   }

   public void setCodPortoDestino(String codPortoDestino) {
        this.codPortoDestino = codPortoDestino;
   }

   public String getCodPortoEmbarque() {
        return codPortoEmbarque;
   }

   public void setCodPortoEmbarque(String codPortoEmbarque) {
        this.codPortoEmbarque = codPortoEmbarque;
   }

   public String getCodPortoTransbordo() {
        return codPortoTransbordo;
   }

   public void setCodPortoTransbordo(String codPortoTransbordo) {
        this.codPortoTransbordo = codPortoTransbordo;
   }

   public String getIrInNavio() {
        return irInNavio;
   }

   public void setIrInNavio(String irInNavio) {
        this.irInNavio = irInNavio;
   }

   public String getQrCode() {
        return qrCode;
   }

   public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
   }

   public BigDecimal getTipoNavegacao() {
        return tipoNavegacao;
   }

   public void setTipoNavegacao(BigDecimal tipoNavegacao) {
        this.tipoNavegacao = tipoNavegacao;
   }

   public String getUsaPesoBrutoNfe() {
        return usaPesoBrutoNfe;
   }

   public void setUsaPesoBrutoNfe(String usaPesoBrutoNfe) {
        this.usaPesoBrutoNfe = usaPesoBrutoNfe;
   }

   public BigDecimal getPesoBrutoTot() {
        return pesoBrutoTot;
   }

   public void setPesoBrutoTot(BigDecimal pesoBrutoTot) {
        this.pesoBrutoTot = pesoBrutoTot;
   }

   public String getUnMed() {
        return unMed;
   }

   public void setUnMed(String unMed) {
        this.unMed = unMed;
   }

   public BigDecimal getUfInicial() {
        return ufInicial;
   }

   public void setUfInicial(BigDecimal ufInicial) {
        this.ufInicial = ufInicial;
   }

   public char[] getXmlEnvCli() {
        return xmlEnvCli;
   }

   public void setXmlEnvCli(char[] xmlEnvCli) {
        this.xmlEnvCli = xmlEnvCli;
   }

   public char[] getXmlProtAut() {
        return xmlProtAut;
   }

   public void setXmlProtAut(char[] xmlProtAut) {
        this.xmlProtAut = xmlProtAut;
   }

   public BigDecimal getNuLoteMdfe() {
        return nuLoteMdfe;
   }

   public void setNuLoteMdfe(BigDecimal nuLoteMdfe) {
        this.nuLoteMdfe = nuLoteMdfe;
   }

   public String getCepCar() {
        return cepCar;
   }

   public void setCepCar(String cepCar) {
        this.cepCar = cepCar;
   }

   public String getCepDescar() {
        return cepDescar;
   }

   public void setCepDescar(String cepDescar) {
        this.cepDescar = cepDescar;
   }

   public String getDescProd() {
        return descProd;
   }

   public void setDescProd(String descProd) {
        this.descProd = descProd;
   }

   public String getEan() {
        return ean;
   }

   public void setEan(String ean) {
        this.ean = ean;
   }

   public BigDecimal getLatCar() {
        return latCar;
   }

   public void setLatCar(BigDecimal latCar) {
        this.latCar = latCar;
   }

   public BigDecimal getLatDescar() {
        return latDescar;
   }

   public void setLatDescar(BigDecimal latDescar) {
        this.latDescar = latDescar;
   }

   public BigDecimal getLonDesgCar() {
        return lonDesgCar;
   }

   public void setLonDesgCar(BigDecimal lonDesgCar) {
        this.lonDesgCar = lonDesgCar;
   }

   public BigDecimal getLongCar() {
        return longCar;
   }

   public void setLongCar(BigDecimal longCar) {
        this.longCar = longCar;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        this.ncm = ncm;
   }

   public String getTpCarga() {
        return tpCarga;
   }

   public void setTpCarga(String tpCarga) {
        this.tpCarga = tpCarga;
   }

   public String getIndCarregPost() {
        return indCarregPost;
   }

   public void setIndCarregPost(String indCarregPost) {
        this.indCarregPost = indCarregPost;
   }

   public BigDecimal getMunFinal() {
        return munFinal;
   }

   public void setMunFinal(BigDecimal munFinal) {
        this.munFinal = munFinal;
   }

   public BigDecimal getMunInicial() {
        return munInicial;
   }

   public void setMunInicial(BigDecimal munInicial) {
        this.munInicial = munInicial;
   }

   @Override
   public String getEntityName() {
        return "Manifesto";
   }

   @Override
   public Manifesto fromVO(DynamicVO vo) {
        this.chaveMdfe = vo.asString("CHAVEMDFE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhEmiss = vo.asTimestamp("DHEMISS");
        this.dhRecibo = vo.asTimestamp("DHRECIBO");
        this.nroRecibo = vo.asString("NRORECIBO");
        this.numAleatorio = vo.asBigDecimal("NUMALEATORIO");
        this.numMdfe = vo.asBigDecimal("NUMMDFE");
        this.numViag = vo.asBigDecimal("NUMVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.statusMdfe = vo.asString("STATUSMDFE");
        this.tipEmiss = vo.asString("TIPEMISS");
        this.ufFinal = vo.asBigDecimal("UFFINAL");
        this.xml = vo.asClob("XML");
        this.codCidEncerramento = vo.asBigDecimal("CODCIDENCERRAMENTO");
        this.codPortoDestino = vo.asString("CODPORTODESTINO");
        this.codPortoEmbarque = vo.asString("CODPORTOEMBARQUE");
        this.codPortoTransbordo = vo.asString("CODPORTOTRANSBORDO");
        this.irInNavio = vo.asString("IRINNAVIO");
        this.qrCode = vo.asString("QRCODE");
        this.tipoNavegacao = vo.asBigDecimal("TIPONAVEGACAO");
        this.usaPesoBrutoNfe = vo.asString("USAPESOBRUTONFE");
        this.pesoBrutoTot = vo.asBigDecimal("PESOBRUTOTOT");
        this.unMed = vo.asString("UNMED");
        this.ufInicial = vo.asBigDecimal("UFINICIAL");
        this.xmlEnvCli = vo.asClob("XMLENVCLI");
        this.xmlProtAut = vo.asClob("XMLPROTAUT");
        this.nuLoteMdfe = vo.asBigDecimal("NULOTEMDFE");
        this.cepCar = vo.asString("CEPCAR");
        this.cepDescar = vo.asString("CEPDESCAR");
        this.descProd = vo.asString("DESCPROD");
        this.ean = vo.asString("EAN");
        this.latCar = vo.asBigDecimal("LATCAR");
        this.latDescar = vo.asBigDecimal("LATDESCAR");
        this.lonDesgCar = vo.asBigDecimal("LONDESGCAR");
        this.longCar = vo.asBigDecimal("LONGCAR");
        this.ncm = vo.asString("NCM");
        this.tpCarga = vo.asString("TPCARGA");
        this.indCarregPost = vo.asString("INDCARREGPOST");
        this.munFinal = vo.asBigDecimal("MUNFINAL");
        this.munInicial = vo.asBigDecimal("MUNINICIAL");
        return this;
   }
}
