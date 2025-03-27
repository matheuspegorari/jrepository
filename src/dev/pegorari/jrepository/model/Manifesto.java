package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Manifesto extends AbstractSankhyaEntity<Manifesto> {
   public String getChaveMdfe() {
        return this.getVo().asString("CHAVEMDFE");
   }

   public void setChaveMdfe(String chaveMdfe) {
        markAsChanged("CHAVEMDFE", chaveMdfe);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhEmiss() {
        return this.getVo().asTimestamp("DHEMISS");
   }

   public void setDhEmiss(Timestamp dhEmiss) {
        markAsChanged("DHEMISS", dhEmiss);
   }

   public Timestamp getDhRecibo() {
        return this.getVo().asTimestamp("DHRECIBO");
   }

   public void setDhRecibo(Timestamp dhRecibo) {
        markAsChanged("DHRECIBO", dhRecibo);
   }

   public String getNroRecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNroRecibo(String nroRecibo) {
        markAsChanged("NRORECIBO", nroRecibo);
   }

   public BigDecimal getNumAleatorio() {
        return this.getVo().asBigDecimal("NUMALEATORIO");
   }

   public void setNumAleatorio(BigDecimal numAleatorio) {
        markAsChanged("NUMALEATORIO", numAleatorio);
   }

   public BigDecimal getNumMdfe() {
        return this.getVo().asBigDecimal("NUMMDFE");
   }

   public void setNumMdfe(BigDecimal numMdfe) {
        markAsChanged("NUMMDFE", numMdfe);
   }

   public BigDecimal getNumViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNumViag(BigDecimal numViag) {
        markAsChanged("NUVIAG", numViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public String getStatusMdfe() {
        return this.getVo().asString("STATUSMDFE");
   }

   public void setStatusMdfe(String statusMdfe) {
        markAsChanged("STATUSMDFE", statusMdfe);
   }

   public String getTipEmiss() {
        return this.getVo().asString("TIPEMISS");
   }

   public void setTipEmiss(String tipEmiss) {
        markAsChanged("TIPEMISS", tipEmiss);
   }

   public BigDecimal getUfFinal() {
        return this.getVo().asBigDecimal("UFFINAL");
   }

   public void setUfFinal(BigDecimal ufFinal) {
        markAsChanged("UFFINAL", ufFinal);
   }

   public char[] getXml() {
        return this.getVo().asClob("XML");
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
   }

   public BigDecimal getCodCidEncerramento() {
        return this.getVo().asBigDecimal("CODCIDENCERRAMENTO");
   }

   public void setCodCidEncerramento(BigDecimal codCidEncerramento) {
        markAsChanged("CODCIDENCERRAMENTO", codCidEncerramento);
   }

   public String getCodPortoDestino() {
        return this.getVo().asString("CODPORTODESTINO");
   }

   public void setCodPortoDestino(String codPortoDestino) {
        markAsChanged("CODPORTODESTINO", codPortoDestino);
   }

   public String getCodPortoEmbarque() {
        return this.getVo().asString("CODPORTOEMBARQUE");
   }

   public void setCodPortoEmbarque(String codPortoEmbarque) {
        markAsChanged("CODPORTOEMBARQUE", codPortoEmbarque);
   }

   public String getCodPortoTransbordo() {
        return this.getVo().asString("CODPORTOTRANSBORDO");
   }

   public void setCodPortoTransbordo(String codPortoTransbordo) {
        markAsChanged("CODPORTOTRANSBORDO", codPortoTransbordo);
   }

   public String getIrInNavio() {
        return this.getVo().asString("IRINNAVIO");
   }

   public void setIrInNavio(String irInNavio) {
        markAsChanged("IRINNAVIO", irInNavio);
   }

   public String getQrCode() {
        return this.getVo().asString("QRCODE");
   }

   public void setQrCode(String qrCode) {
        markAsChanged("QRCODE", qrCode);
   }

   public BigDecimal getTipoNavegacao() {
        return this.getVo().asBigDecimal("TIPONAVEGACAO");
   }

   public void setTipoNavegacao(BigDecimal tipoNavegacao) {
        markAsChanged("TIPONAVEGACAO", tipoNavegacao);
   }

   public String getUsaPesoBrutoNfe() {
        return this.getVo().asString("USAPESOBRUTONFE");
   }

   public void setUsaPesoBrutoNfe(String usaPesoBrutoNfe) {
        markAsChanged("USAPESOBRUTONFE", usaPesoBrutoNfe);
   }

   public BigDecimal getPesoBrutoTot() {
        return this.getVo().asBigDecimal("PESOBRUTOTOT");
   }

   public void setPesoBrutoTot(BigDecimal pesoBrutoTot) {
        markAsChanged("PESOBRUTOTOT", pesoBrutoTot);
   }

   public String getUnMed() {
        return this.getVo().asString("UNMED");
   }

   public void setUnMed(String unMed) {
        markAsChanged("UNMED", unMed);
   }

   public BigDecimal getUfInicial() {
        return this.getVo().asBigDecimal("UFINICIAL");
   }

   public void setUfInicial(BigDecimal ufInicial) {
        markAsChanged("UFINICIAL", ufInicial);
   }

   public char[] getXmlEnvCli() {
        return this.getVo().asClob("XMLENVCLI");
   }

   public void setXmlEnvCli(char[] xmlEnvCli) {
        markAsChanged("XMLENVCLI", xmlEnvCli);
   }

   public char[] getXmlProtAut() {
        return this.getVo().asClob("XMLPROTAUT");
   }

   public void setXmlProtAut(char[] xmlProtAut) {
        markAsChanged("XMLPROTAUT", xmlProtAut);
   }

   public BigDecimal getNuLoteMdfe() {
        return this.getVo().asBigDecimal("NULOTEMDFE");
   }

   public void setNuLoteMdfe(BigDecimal nuLoteMdfe) {
        markAsChanged("NULOTEMDFE", nuLoteMdfe);
   }

   public String getCepCar() {
        return this.getVo().asString("CEPCAR");
   }

   public void setCepCar(String cepCar) {
        markAsChanged("CEPCAR", cepCar);
   }

   public String getCepDescar() {
        return this.getVo().asString("CEPDESCAR");
   }

   public void setCepDescar(String cepDescar) {
        markAsChanged("CEPDESCAR", cepDescar);
   }

   public String getDescProd() {
        return this.getVo().asString("DESCPROD");
   }

   public void setDescProd(String descProd) {
        markAsChanged("DESCPROD", descProd);
   }

   public String getEan() {
        return this.getVo().asString("EAN");
   }

   public void setEan(String ean) {
        markAsChanged("EAN", ean);
   }

   public BigDecimal getLatCar() {
        return this.getVo().asBigDecimal("LATCAR");
   }

   public void setLatCar(BigDecimal latCar) {
        markAsChanged("LATCAR", latCar);
   }

   public BigDecimal getLatDescar() {
        return this.getVo().asBigDecimal("LATDESCAR");
   }

   public void setLatDescar(BigDecimal latDescar) {
        markAsChanged("LATDESCAR", latDescar);
   }

   public BigDecimal getLonDesgCar() {
        return this.getVo().asBigDecimal("LONDESGCAR");
   }

   public void setLonDesgCar(BigDecimal lonDesgCar) {
        markAsChanged("LONDESGCAR", lonDesgCar);
   }

   public BigDecimal getLongCar() {
        return this.getVo().asBigDecimal("LONGCAR");
   }

   public void setLongCar(BigDecimal longCar) {
        markAsChanged("LONGCAR", longCar);
   }

   public String getNcm() {
        return this.getVo().asString("NCM");
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
   }

   public String getTpCarga() {
        return this.getVo().asString("TPCARGA");
   }

   public void setTpCarga(String tpCarga) {
        markAsChanged("TPCARGA", tpCarga);
   }

   public String getIndCarregPost() {
        return this.getVo().asString("INDCARREGPOST");
   }

   public void setIndCarregPost(String indCarregPost) {
        markAsChanged("INDCARREGPOST", indCarregPost);
   }

   public BigDecimal getMunFinal() {
        return this.getVo().asBigDecimal("MUNFINAL");
   }

   public void setMunFinal(BigDecimal munFinal) {
        markAsChanged("MUNFINAL", munFinal);
   }

   public BigDecimal getMunInicial() {
        return this.getVo().asBigDecimal("MUNINICIAL");
   }

   public void setMunInicial(BigDecimal munInicial) {
        markAsChanged("MUNINICIAL", munInicial);
   }

   @Override
   public String getTableName() {
        return "TGFMDFE";
   }

   @Override
   public String getEntityName() {
        return "Manifesto";
   }

   @Override
   public Manifesto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
