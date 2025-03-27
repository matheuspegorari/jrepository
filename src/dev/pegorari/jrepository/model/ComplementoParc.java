package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComplementoParc extends AbstractSankhyaEntity<ComplementoParc> {
   public String getNroCnh() {
        return this.getVo().asString("NROCNH");
   }

   public void setNroCnh(String nroCnh) {
        markAsChanged("NROCNH", nroCnh);
   }

   public String getNumEntrega() {
        return this.getVo().asString("NUMENTREGA");
   }

   public void setNumEntrega(String numEntrega) {
        markAsChanged("NUMENTREGA", numEntrega);
   }

   public String getNumReceb() {
        return this.getVo().asString("NUMRECEB");
   }

   public void setNumReceb(String numReceb) {
        markAsChanged("NUMRECEB", numReceb);
   }

   public BigDecimal getSeqVisita() {
        return this.getVo().asBigDecimal("SEQVISITA");
   }

   public void setSeqVisita(BigDecimal seqVisita) {
        markAsChanged("SEQVISITA", seqVisita);
   }

   public BigDecimal getMultHoraExtra() {
        return this.getVo().asBigDecimal("MULTHORAEXTRA");
   }

   public void setMultHoraExtra(BigDecimal multHoraExtra) {
        markAsChanged("MULTHORAEXTRA", multHoraExtra);
   }

   public String getIdentificacao() {
        return this.getVo().asString("IDENTIFICACAO");
   }

   public void setIdentificacao(String identificacao) {
        markAsChanged("IDENTIFICACAO", identificacao);
   }

   public byte[] getImagem() {
        return this.getVo().asBlob("IMAGEM");
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public String getIsentoTaxaMinBoleta() {
        return this.getVo().asString("ISENTOTAXAMINBOLETA");
   }

   public void setIsentoTaxaMinBoleta(String isentoTaxaMinBoleta) {
        markAsChanged("ISENTOTAXAMINBOLETA", isentoTaxaMinBoleta);
   }

   public String getLatitudeEntrega() {
        return this.getVo().asString("LATITUDEENTREGA");
   }

   public void setLatitudeEntrega(String latitudeEntrega) {
        markAsChanged("LATITUDEENTREGA", latitudeEntrega);
   }

   public String getLogistica() {
        return this.getVo().asString("LOGISTICA");
   }

   public void setLogistica(String logistica) {
        markAsChanged("LOGISTICA", logistica);
   }

   public String getCategoriaCnh() {
        return this.getVo().asString("CATEGORIACNH");
   }

   public void setCategoriaCnh(String categoriaCnh) {
        markAsChanged("CATEGORIACNH", categoriaCnh);
   }

   public String getCepEntrega() {
        return this.getVo().asString("CEPENTREGA");
   }

   public void setCepEntrega(String cepEntrega) {
        markAsChanged("CEPENTREGA", cepEntrega);
   }

   public String getCepReceb() {
        return this.getVo().asString("CEPRECEB");
   }

   public void setCepReceb(String cepReceb) {
        markAsChanged("CEPRECEB", cepReceb);
   }

   public String getCepTrab() {
        return this.getVo().asString("CEPTRAB");
   }

   public void setCepTrab(String cepTrab) {
        markAsChanged("CEPTRAB", cepTrab);
   }

   public BigDecimal getCodBaiEntrega() {
        return this.getVo().asBigDecimal("CODBAIENTREGA");
   }

   public void setCodBaiEntrega(BigDecimal codBaiEntrega) {
        markAsChanged("CODBAIENTREGA", codBaiEntrega);
   }

   public BigDecimal getCodBaiReceb() {
        return this.getVo().asBigDecimal("CODBAIRECEB");
   }

   public void setCodBaiReceb(BigDecimal codBaiReceb) {
        markAsChanged("CODBAIRECEB", codBaiReceb);
   }

   public BigDecimal getCodBaiTrab() {
        return this.getVo().asBigDecimal("CODBAITRAB");
   }

   public void setCodBaiTrab(BigDecimal codBaiTrab) {
        markAsChanged("CODBAITRAB", codBaiTrab);
   }

   public BigDecimal getCodCidEntrega() {
        return this.getVo().asBigDecimal("CODCIDENTREGA");
   }

   public void setCodCidEntrega(BigDecimal codCidEntrega) {
        markAsChanged("CODCIDENTREGA", codCidEntrega);
   }

   public BigDecimal getCodCidReceb() {
        return this.getVo().asBigDecimal("CODCIDRECEB");
   }

   public void setCodCidReceb(BigDecimal codCidReceb) {
        markAsChanged("CODCIDRECEB", codCidReceb);
   }

   public BigDecimal getCodCidTrab() {
        return this.getVo().asBigDecimal("CODCIDTRAB");
   }

   public void setCodCidTrab(BigDecimal codCidTrab) {
        markAsChanged("CODCIDTRAB", codCidTrab);
   }

   public BigDecimal getCodCred() {
        return this.getVo().asBigDecimal("CODCRED");
   }

   public void setCodCred(BigDecimal codCred) {
        markAsChanged("CODCRED", codCred);
   }

   public BigDecimal getCodEndEntrega() {
        return this.getVo().asBigDecimal("CODENDENTREGA");
   }

   public void setCodEndEntrega(BigDecimal codEndEntrega) {
        markAsChanged("CODENDENTREGA", codEndEntrega);
   }

   public BigDecimal getCodEndReceb() {
        return this.getVo().asBigDecimal("CODENDRECEB");
   }

   public void setCodEndReceb(BigDecimal codEndReceb) {
        markAsChanged("CODENDRECEB", codEndReceb);
   }

   public BigDecimal getCodEndTrab() {
        return this.getVo().asBigDecimal("CODENDTRAB");
   }

   public void setCodEndTrab(BigDecimal codEndTrab) {
        markAsChanged("CODENDTRAB", codEndTrab);
   }

   public BigDecimal getCodMoedaLim() {
        return this.getVo().asBigDecimal("CODMOEDALIM");
   }

   public void setCodMoedaLim(BigDecimal codMoedaLim) {
        markAsChanged("CODMOEDALIM", codMoedaLim);
   }

   public BigDecimal getCodMoedaRenda() {
        return this.getVo().asBigDecimal("CODMOEDARENDA");
   }

   public void setCodMoedaRenda(BigDecimal codMoedaRenda) {
        markAsChanged("CODMOEDARENDA", codMoedaRenda);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcTransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
   }

   public String getCodSuframa() {
        return this.getVo().asString("CODSUFRAMA");
   }

   public void setCodSuframa(String codSuframa) {
        markAsChanged("CODSUFRAMA", codSuframa);
   }

   public BigDecimal getCodTabCot() {
        return this.getVo().asBigDecimal("CODTABCOT");
   }

   public void setCodTabCot(BigDecimal codTabCot) {
        markAsChanged("CODTABCOT", codTabCot);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplEntrega() {
        return this.getVo().asString("COMPLENTREGA");
   }

   public void setComplEntrega(String complEntrega) {
        markAsChanged("COMPLENTREGA", complEntrega);
   }

   public String getComplReceb() {
        return this.getVo().asString("COMPLRECEB");
   }

   public void setComplReceb(String complReceb) {
        markAsChanged("COMPLRECEB", complReceb);
   }

   public String getComplTrab() {
        return this.getVo().asString("COMPLTRAB");
   }

   public void setComplTrab(String complTrab) {
        markAsChanged("COMPLTRAB", complTrab);
   }

   public String getConjuge() {
        return this.getVo().asString("CONJUGE");
   }

   public void setConjuge(String conjuge) {
        markAsChanged("CONJUGE", conjuge);
   }

   public String getCrea() {
        return this.getVo().asString("CREA");
   }

   public void setCrea(String crea) {
        markAsChanged("CREA", crea);
   }

   public BigDecimal getDiaPag() {
        return this.getVo().asBigDecimal("DIAPAG");
   }

   public void setDiaPag(BigDecimal diaPag) {
        markAsChanged("DIAPAG", diaPag);
   }

   public Timestamp getDtAdm() {
        return this.getVo().asTimestamp("DTADM");
   }

   public void setDtAdm(Timestamp dtAdm) {
        markAsChanged("DTADM", dtAdm);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtCrea() {
        return this.getVo().asTimestamp("DTCREA");
   }

   public void setDtCrea(Timestamp dtCrea) {
        markAsChanged("DTCREA", dtCrea);
   }

   public String getExigePedido() {
        return this.getVo().asString("EXIGEPEDIDO");
   }

   public void setExigePedido(String exigePedido) {
        markAsChanged("EXIGEPEDIDO", exigePedido);
   }

   public BigDecimal getFatMin() {
        return this.getVo().asBigDecimal("FATMIN");
   }

   public void setFatMin(BigDecimal fatMin) {
        markAsChanged("FATMIN", fatMin);
   }

   public String getGerarFrete() {
        return this.getVo().asString("GERARFRETE");
   }

   public void setGerarFrete(String gerarFrete) {
        markAsChanged("GERARFRETE", gerarFrete);
   }

   public BigDecimal getSugTipNegEntr() {
        return this.getVo().asBigDecimal("SUGTIPNEGENTR");
   }

   public void setSugTipNegEntr(BigDecimal sugTipNegEntr) {
        markAsChanged("SUGTIPNEGENTR", sugTipNegEntr);
   }

   public BigDecimal getSugTipNegSaid() {
        return this.getVo().asBigDecimal("SUGTIPNEGSAID");
   }

   public void setSugTipNegSaid(BigDecimal sugTipNegSaid) {
        markAsChanged("SUGTIPNEGSAID", sugTipNegSaid);
   }

   public String getTelTrab() {
        return this.getVo().asString("TELTRAB");
   }

   public void setTelTrab(String telTrab) {
        markAsChanged("TELTRAB", telTrab);
   }

   public Timestamp getTempoResid() {
        return this.getVo().asTimestamp("TEMPORESID");
   }

   public void setTempoResid(Timestamp tempoResid) {
        markAsChanged("TEMPORESID", tempoResid);
   }

   public String getTipMoradia() {
        return this.getVo().asString("TIPMORADIA");
   }

   public void setTipMoradia(String tipMoradia) {
        markAsChanged("TIPMORADIA", tipMoradia);
   }

   public String getUfCrea() {
        return this.getVo().asString("UFCREA");
   }

   public void setUfCrea(String ufCrea) {
        markAsChanged("UFCREA", ufCrea);
   }

   public String getUsaSaidaFatPer() {
        return this.getVo().asString("USASAIDAFATPER");
   }

   public void setUsaSaidaFatPer(String usaSaidaFatPer) {
        markAsChanged("USASAIDAFATPER", usaSaidaFatPer);
   }

   public Timestamp getVencimentoCnh() {
        return this.getVo().asTimestamp("VENCIMENTOCNH");
   }

   public void setVencimentoCnh(Timestamp vencimentoCnh) {
        markAsChanged("VENCIMENTOCNH", vencimentoCnh);
   }

   public String getViaTransp() {
        return this.getVo().asString("VIATRANSP");
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
   }

   public String getGrupoDescParc() {
        return this.getVo().asString("GRUPODESCPARC");
   }

   public void setGrupoDescParc(String grupoDescParc) {
        markAsChanged("GRUPODESCPARC", grupoDescParc);
   }

   public String getLimCredAutom() {
        return this.getVo().asString("LIMCREDAUTOM");
   }

   public void setLimCredAutom(String limCredAutom) {
        markAsChanged("LIMCREDAUTOM", limCredAutom);
   }

   public String getLocalTrab() {
        return this.getVo().asString("LOCALTRAB");
   }

   public void setLocalTrab(String localTrab) {
        markAsChanged("LOCALTRAB", localTrab);
   }

   public String getNumTrab() {
        return this.getVo().asString("NUMTRAB");
   }

   public void setNumTrab(String numTrab) {
        markAsChanged("NUMTRAB", numTrab);
   }

   public String getPai() {
        return this.getVo().asString("PAI");
   }

   public void setPai(String pai) {
        markAsChanged("PAI", pai);
   }

   public String getPlacaVeiculo() {
        return this.getVo().asString("PLACAVEICULO");
   }

   public void setPlacaVeiculo(String placaVeiculo) {
        markAsChanged("PLACAVEICULO", placaVeiculo);
   }

   public BigDecimal getRamal() {
        return this.getVo().asBigDecimal("RAMAL");
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public BigDecimal getRendaMensal() {
        return this.getVo().asBigDecimal("RENDAMENSAL");
   }

   public void setRendaMensal(BigDecimal rendaMensal) {
        markAsChanged("RENDAMENSAL", rendaMensal);
   }

   public BigDecimal getSeqEntrega() {
        return this.getVo().asBigDecimal("SEQENTREGA");
   }

   public void setSeqEntrega(BigDecimal seqEntrega) {
        markAsChanged("SEQENTREGA", seqEntrega);
   }

   public String getLongitudeEntrega() {
        return this.getVo().asString("LONGITUDEENTREGA");
   }

   public void setLongitudeEntrega(String longitudeEntrega) {
        markAsChanged("LONGITUDEENTREGA", longitudeEntrega);
   }

   public String getMae() {
        return this.getVo().asString("MAE");
   }

   public void setMae(String mae) {
        markAsChanged("MAE", mae);
   }

   public Timestamp getDhCadSuframa() {
        return this.getVo().asTimestamp("DHCADSUFRAMA");
   }

   public void setDhCadSuframa(Timestamp dhCadSuframa) {
        markAsChanged("DHCADSUFRAMA", dhCadSuframa);
   }

   public BigDecimal getNacionalidade() {
        return this.getVo().asBigDecimal("NACIONALIDADE");
   }

   public void setNacionalidade(BigDecimal nacionalidade) {
        markAsChanged("NACIONALIDADE", nacionalidade);
   }

   public BigDecimal getNaturalidade() {
        return this.getVo().asBigDecimal("NATURALIDADE");
   }

   public void setNaturalidade(BigDecimal naturalidade) {
        markAsChanged("NATURALIDADE", naturalidade);
   }

   public String getSitCadSuframa() {
        return this.getVo().asString("SITCADSUFRAMA");
   }

   public void setSitCadSuframa(String sitCadSuframa) {
        markAsChanged("SITCADSUFRAMA", sitCadSuframa);
   }

   public String getSemRepRedAgro() {
        return this.getVo().asString("SEMREPREDAGRO");
   }

   public void setSemRepRedAgro(String semRepRedAgro) {
        markAsChanged("SEMREPREDAGRO", semRepRedAgro);
   }

   public BigDecimal getDiaSemanaPag() {
        return this.getVo().asBigDecimal("DIASEMANAPAG");
   }

   public void setDiaSemanaPag(BigDecimal diaSemanaPag) {
        markAsChanged("DIASEMANAPAG", diaSemanaPag);
   }

   public String getCodVolFat() {
        return this.getVo().asString("CODVOLFAT");
   }

   public void setCodVolFat(String codVolFat) {
        markAsChanged("CODVOLFAT", codVolFat);
   }

   public String getTemSuframaPiscof() {
        return this.getVo().asString("TEMSUFRAMAPISCOF");
   }

   public void setTemSuframaPiscof(String temSuframaPiscof) {
        markAsChanged("TEMSUFRAMAPISCOF", temSuframaPiscof);
   }

   public BigDecimal getDiaPag2() {
        return this.getVo().asBigDecimal("DIAPAG2");
   }

   public void setDiaPag2(BigDecimal diaPag2) {
        markAsChanged("DIAPAG2", diaPag2);
   }

   public BigDecimal getDiaPag3() {
        return this.getVo().asBigDecimal("DIAPAG3");
   }

   public void setDiaPag3(BigDecimal diaPag3) {
        markAsChanged("DIAPAG3", diaPag3);
   }

   public BigDecimal getDiaPag4() {
        return this.getVo().asBigDecimal("DIAPAG4");
   }

   public void setDiaPag4(BigDecimal diaPag4) {
        markAsChanged("DIAPAG4", diaPag4);
   }

   public BigDecimal getDiaPag5() {
        return this.getVo().asBigDecimal("DIAPAG5");
   }

   public void setDiaPag5(BigDecimal diaPag5) {
        markAsChanged("DIAPAG5", diaPag5);
   }

   public BigDecimal getDiaPag6() {
        return this.getVo().asBigDecimal("DIAPAG6");
   }

   public void setDiaPag6(BigDecimal diaPag6) {
        markAsChanged("DIAPAG6", diaPag6);
   }

   public BigDecimal getCodIndNif() {
        return this.getVo().asBigDecimal("CODINDNIF");
   }

   public void setCodIndNif(BigDecimal codIndNif) {
        markAsChanged("CODINDNIF", codIndNif);
   }

   public BigDecimal getInfoIsenImuni() {
        return this.getVo().asBigDecimal("INFOISENIMUNI");
   }

   public void setInfoIsenImuni(BigDecimal infoIsenImuni) {
        markAsChanged("INFOISENIMUNI", infoIsenImuni);
   }

   public String getNumIndNif() {
        return this.getVo().asString("NUMINDNIF");
   }

   public void setNumIndNif(String numIndNif) {
        markAsChanged("NUMINDNIF", numIndNif);
   }

   public BigDecimal getTpFontePag() {
        return this.getVo().asBigDecimal("TPFONTEPAG");
   }

   public void setTpFontePag(BigDecimal tpFontePag) {
        markAsChanged("TPFONTEPAG", tpFontePag);
   }

   public BigDecimal getTpIrrfExt() {
        return this.getVo().asBigDecimal("TPIRRFEXT");
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        markAsChanged("TPIRRFEXT", tpIrrfExt);
   }

   @Override
   public String getTableName() {
        return "TGFCPL";
   }

   @Override
   public String getEntityName() {
        return "ComplementoParc";
   }

   @Override
   public ComplementoParc fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
