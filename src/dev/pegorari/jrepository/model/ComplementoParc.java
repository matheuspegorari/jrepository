package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComplementoParc extends AbstractSankhyaEntity<ComplementoParc> {
   private String nroCnh;
   private String numEntrega;
   private String numReceb;
   private BigDecimal seqVisita;
   private BigDecimal multHoraExtra;
   private String identificacao;
   private byte[] imagem;
   private String isentoTaxaMinBoleta;
   private String latitudeEntrega;
   private String logistica;
   private String categoriaCnh;
   private String cepEntrega;
   private String cepReceb;
   private String cepTrab;
   private BigDecimal codBaiEntrega;
   private BigDecimal codBaiReceb;
   private BigDecimal codBaiTrab;
   private BigDecimal codCidEntrega;
   private BigDecimal codCidReceb;
   private BigDecimal codCidTrab;
   private BigDecimal codCred;
   private BigDecimal codEndEntrega;
   private BigDecimal codEndReceb;
   private BigDecimal codEndTrab;
   private BigDecimal codMoedaLim;
   private BigDecimal codMoedaRenda;
   private BigDecimal codParc;
   private BigDecimal codParcTransp;
   private String codSuframa;
   private BigDecimal codTabCot;
   private BigDecimal codUsu;
   private String complEntrega;
   private String complReceb;
   private String complTrab;
   private String conjuge;
   private String crea;
   private BigDecimal diaPag;
   private Timestamp dtAdm;
   private Timestamp dtAlter;
   private Timestamp dtCrea;
   private String exigePedido;
   private BigDecimal fatMin;
   private String gerarFrete;
   private BigDecimal sugTipNegEntr;
   private BigDecimal sugTipNegSaid;
   private String telTrab;
   private Timestamp tempoResid;
   private String tipMoradia;
   private String ufCrea;
   private String usaSaidaFatPer;
   private Timestamp vencimentoCnh;
   private String viaTransp;
   private String grupoDescParc;
   private String limCredAutom;
   private String localTrab;
   private String numTrab;
   private String pai;
   private String placaVeiculo;
   private BigDecimal ramal;
   private BigDecimal rendaMensal;
   private BigDecimal seqEntrega;
   private String longitudeEntrega;
   private String mae;
   private Timestamp dhCadSuframa;
   private BigDecimal nacionalidade;
   private BigDecimal naturalidade;
   private String sitCadSuframa;
   private String semRepRedAgro;
   private BigDecimal diaSemanaPag;
   private String codVolFat;
   private String temSuframaPiscof;
   private BigDecimal diaPag2;
   private BigDecimal diaPag3;
   private BigDecimal diaPag4;
   private BigDecimal diaPag5;
   private BigDecimal diaPag6;
   private BigDecimal codIndNif;
   private BigDecimal infoIsenImuni;
   private String numIndNif;
   private BigDecimal tpFontePag;
   private BigDecimal tpIrrfExt;

   public String getNroCnh() {
        return nroCnh;
   }

   public void setNroCnh(String nroCnh) {
        this.nroCnh = nroCnh;
   }

   public String getNumEntrega() {
        return numEntrega;
   }

   public void setNumEntrega(String numEntrega) {
        this.numEntrega = numEntrega;
   }

   public String getNumReceb() {
        return numReceb;
   }

   public void setNumReceb(String numReceb) {
        this.numReceb = numReceb;
   }

   public BigDecimal getSeqVisita() {
        return seqVisita;
   }

   public void setSeqVisita(BigDecimal seqVisita) {
        this.seqVisita = seqVisita;
   }

   public BigDecimal getMultHoraExtra() {
        return multHoraExtra;
   }

   public void setMultHoraExtra(BigDecimal multHoraExtra) {
        this.multHoraExtra = multHoraExtra;
   }

   public String getIdentificacao() {
        return identificacao;
   }

   public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        this.imagem = imagem;
   }

   public String getIsentoTaxaMinBoleta() {
        return isentoTaxaMinBoleta;
   }

   public void setIsentoTaxaMinBoleta(String isentoTaxaMinBoleta) {
        this.isentoTaxaMinBoleta = isentoTaxaMinBoleta;
   }

   public String getLatitudeEntrega() {
        return latitudeEntrega;
   }

   public void setLatitudeEntrega(String latitudeEntrega) {
        this.latitudeEntrega = latitudeEntrega;
   }

   public String getLogistica() {
        return logistica;
   }

   public void setLogistica(String logistica) {
        this.logistica = logistica;
   }

   public String getCategoriaCnh() {
        return categoriaCnh;
   }

   public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
   }

   public String getCepEntrega() {
        return cepEntrega;
   }

   public void setCepEntrega(String cepEntrega) {
        this.cepEntrega = cepEntrega;
   }

   public String getCepReceb() {
        return cepReceb;
   }

   public void setCepReceb(String cepReceb) {
        this.cepReceb = cepReceb;
   }

   public String getCepTrab() {
        return cepTrab;
   }

   public void setCepTrab(String cepTrab) {
        this.cepTrab = cepTrab;
   }

   public BigDecimal getCodBaiEntrega() {
        return codBaiEntrega;
   }

   public void setCodBaiEntrega(BigDecimal codBaiEntrega) {
        this.codBaiEntrega = codBaiEntrega;
   }

   public BigDecimal getCodBaiReceb() {
        return codBaiReceb;
   }

   public void setCodBaiReceb(BigDecimal codBaiReceb) {
        this.codBaiReceb = codBaiReceb;
   }

   public BigDecimal getCodBaiTrab() {
        return codBaiTrab;
   }

   public void setCodBaiTrab(BigDecimal codBaiTrab) {
        this.codBaiTrab = codBaiTrab;
   }

   public BigDecimal getCodCidEntrega() {
        return codCidEntrega;
   }

   public void setCodCidEntrega(BigDecimal codCidEntrega) {
        this.codCidEntrega = codCidEntrega;
   }

   public BigDecimal getCodCidReceb() {
        return codCidReceb;
   }

   public void setCodCidReceb(BigDecimal codCidReceb) {
        this.codCidReceb = codCidReceb;
   }

   public BigDecimal getCodCidTrab() {
        return codCidTrab;
   }

   public void setCodCidTrab(BigDecimal codCidTrab) {
        this.codCidTrab = codCidTrab;
   }

   public BigDecimal getCodCred() {
        return codCred;
   }

   public void setCodCred(BigDecimal codCred) {
        this.codCred = codCred;
   }

   public BigDecimal getCodEndEntrega() {
        return codEndEntrega;
   }

   public void setCodEndEntrega(BigDecimal codEndEntrega) {
        this.codEndEntrega = codEndEntrega;
   }

   public BigDecimal getCodEndReceb() {
        return codEndReceb;
   }

   public void setCodEndReceb(BigDecimal codEndReceb) {
        this.codEndReceb = codEndReceb;
   }

   public BigDecimal getCodEndTrab() {
        return codEndTrab;
   }

   public void setCodEndTrab(BigDecimal codEndTrab) {
        this.codEndTrab = codEndTrab;
   }

   public BigDecimal getCodMoedaLim() {
        return codMoedaLim;
   }

   public void setCodMoedaLim(BigDecimal codMoedaLim) {
        this.codMoedaLim = codMoedaLim;
   }

   public BigDecimal getCodMoedaRenda() {
        return codMoedaRenda;
   }

   public void setCodMoedaRenda(BigDecimal codMoedaRenda) {
        this.codMoedaRenda = codMoedaRenda;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        this.codParcTransp = codParcTransp;
   }

   public String getCodSuframa() {
        return codSuframa;
   }

   public void setCodSuframa(String codSuframa) {
        this.codSuframa = codSuframa;
   }

   public BigDecimal getCodTabCot() {
        return codTabCot;
   }

   public void setCodTabCot(BigDecimal codTabCot) {
        this.codTabCot = codTabCot;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getComplEntrega() {
        return complEntrega;
   }

   public void setComplEntrega(String complEntrega) {
        this.complEntrega = complEntrega;
   }

   public String getComplReceb() {
        return complReceb;
   }

   public void setComplReceb(String complReceb) {
        this.complReceb = complReceb;
   }

   public String getComplTrab() {
        return complTrab;
   }

   public void setComplTrab(String complTrab) {
        this.complTrab = complTrab;
   }

   public String getConjuge() {
        return conjuge;
   }

   public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
   }

   public String getCrea() {
        return crea;
   }

   public void setCrea(String crea) {
        this.crea = crea;
   }

   public BigDecimal getDiaPag() {
        return diaPag;
   }

   public void setDiaPag(BigDecimal diaPag) {
        this.diaPag = diaPag;
   }

   public Timestamp getDtAdm() {
        return dtAdm;
   }

   public void setDtAdm(Timestamp dtAdm) {
        this.dtAdm = dtAdm;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtCrea() {
        return dtCrea;
   }

   public void setDtCrea(Timestamp dtCrea) {
        this.dtCrea = dtCrea;
   }

   public String getExigePedido() {
        return exigePedido;
   }

   public void setExigePedido(String exigePedido) {
        this.exigePedido = exigePedido;
   }

   public BigDecimal getFatMin() {
        return fatMin;
   }

   public void setFatMin(BigDecimal fatMin) {
        this.fatMin = fatMin;
   }

   public String getGerarFrete() {
        return gerarFrete;
   }

   public void setGerarFrete(String gerarFrete) {
        this.gerarFrete = gerarFrete;
   }

   public BigDecimal getSugTipNegEntr() {
        return sugTipNegEntr;
   }

   public void setSugTipNegEntr(BigDecimal sugTipNegEntr) {
        this.sugTipNegEntr = sugTipNegEntr;
   }

   public BigDecimal getSugTipNegSaid() {
        return sugTipNegSaid;
   }

   public void setSugTipNegSaid(BigDecimal sugTipNegSaid) {
        this.sugTipNegSaid = sugTipNegSaid;
   }

   public String getTelTrab() {
        return telTrab;
   }

   public void setTelTrab(String telTrab) {
        this.telTrab = telTrab;
   }

   public Timestamp getTempoResid() {
        return tempoResid;
   }

   public void setTempoResid(Timestamp tempoResid) {
        this.tempoResid = tempoResid;
   }

   public String getTipMoradia() {
        return tipMoradia;
   }

   public void setTipMoradia(String tipMoradia) {
        this.tipMoradia = tipMoradia;
   }

   public String getUfCrea() {
        return ufCrea;
   }

   public void setUfCrea(String ufCrea) {
        this.ufCrea = ufCrea;
   }

   public String getUsaSaidaFatPer() {
        return usaSaidaFatPer;
   }

   public void setUsaSaidaFatPer(String usaSaidaFatPer) {
        this.usaSaidaFatPer = usaSaidaFatPer;
   }

   public Timestamp getVencimentoCnh() {
        return vencimentoCnh;
   }

   public void setVencimentoCnh(Timestamp vencimentoCnh) {
        this.vencimentoCnh = vencimentoCnh;
   }

   public String getViaTransp() {
        return viaTransp;
   }

   public void setViaTransp(String viaTransp) {
        this.viaTransp = viaTransp;
   }

   public String getGrupoDescParc() {
        return grupoDescParc;
   }

   public void setGrupoDescParc(String grupoDescParc) {
        this.grupoDescParc = grupoDescParc;
   }

   public String getLimCredAutom() {
        return limCredAutom;
   }

   public void setLimCredAutom(String limCredAutom) {
        this.limCredAutom = limCredAutom;
   }

   public String getLocalTrab() {
        return localTrab;
   }

   public void setLocalTrab(String localTrab) {
        this.localTrab = localTrab;
   }

   public String getNumTrab() {
        return numTrab;
   }

   public void setNumTrab(String numTrab) {
        this.numTrab = numTrab;
   }

   public String getPai() {
        return pai;
   }

   public void setPai(String pai) {
        this.pai = pai;
   }

   public String getPlacaVeiculo() {
        return placaVeiculo;
   }

   public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
   }

   public BigDecimal getRamal() {
        return ramal;
   }

   public void setRamal(BigDecimal ramal) {
        this.ramal = ramal;
   }

   public BigDecimal getRendaMensal() {
        return rendaMensal;
   }

   public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
   }

   public BigDecimal getSeqEntrega() {
        return seqEntrega;
   }

   public void setSeqEntrega(BigDecimal seqEntrega) {
        this.seqEntrega = seqEntrega;
   }

   public String getLongitudeEntrega() {
        return longitudeEntrega;
   }

   public void setLongitudeEntrega(String longitudeEntrega) {
        this.longitudeEntrega = longitudeEntrega;
   }

   public String getMae() {
        return mae;
   }

   public void setMae(String mae) {
        this.mae = mae;
   }

   public Timestamp getDhCadSuframa() {
        return dhCadSuframa;
   }

   public void setDhCadSuframa(Timestamp dhCadSuframa) {
        this.dhCadSuframa = dhCadSuframa;
   }

   public BigDecimal getNacionalidade() {
        return nacionalidade;
   }

   public void setNacionalidade(BigDecimal nacionalidade) {
        this.nacionalidade = nacionalidade;
   }

   public BigDecimal getNaturalidade() {
        return naturalidade;
   }

   public void setNaturalidade(BigDecimal naturalidade) {
        this.naturalidade = naturalidade;
   }

   public String getSitCadSuframa() {
        return sitCadSuframa;
   }

   public void setSitCadSuframa(String sitCadSuframa) {
        this.sitCadSuframa = sitCadSuframa;
   }

   public String getSemRepRedAgro() {
        return semRepRedAgro;
   }

   public void setSemRepRedAgro(String semRepRedAgro) {
        this.semRepRedAgro = semRepRedAgro;
   }

   public BigDecimal getDiaSemanaPag() {
        return diaSemanaPag;
   }

   public void setDiaSemanaPag(BigDecimal diaSemanaPag) {
        this.diaSemanaPag = diaSemanaPag;
   }

   public String getCodVolFat() {
        return codVolFat;
   }

   public void setCodVolFat(String codVolFat) {
        this.codVolFat = codVolFat;
   }

   public String getTemSuframaPiscof() {
        return temSuframaPiscof;
   }

   public void setTemSuframaPiscof(String temSuframaPiscof) {
        this.temSuframaPiscof = temSuframaPiscof;
   }

   public BigDecimal getDiaPag2() {
        return diaPag2;
   }

   public void setDiaPag2(BigDecimal diaPag2) {
        this.diaPag2 = diaPag2;
   }

   public BigDecimal getDiaPag3() {
        return diaPag3;
   }

   public void setDiaPag3(BigDecimal diaPag3) {
        this.diaPag3 = diaPag3;
   }

   public BigDecimal getDiaPag4() {
        return diaPag4;
   }

   public void setDiaPag4(BigDecimal diaPag4) {
        this.diaPag4 = diaPag4;
   }

   public BigDecimal getDiaPag5() {
        return diaPag5;
   }

   public void setDiaPag5(BigDecimal diaPag5) {
        this.diaPag5 = diaPag5;
   }

   public BigDecimal getDiaPag6() {
        return diaPag6;
   }

   public void setDiaPag6(BigDecimal diaPag6) {
        this.diaPag6 = diaPag6;
   }

   public BigDecimal getCodIndNif() {
        return codIndNif;
   }

   public void setCodIndNif(BigDecimal codIndNif) {
        this.codIndNif = codIndNif;
   }

   public BigDecimal getInfoIsenImuni() {
        return infoIsenImuni;
   }

   public void setInfoIsenImuni(BigDecimal infoIsenImuni) {
        this.infoIsenImuni = infoIsenImuni;
   }

   public String getNumIndNif() {
        return numIndNif;
   }

   public void setNumIndNif(String numIndNif) {
        this.numIndNif = numIndNif;
   }

   public BigDecimal getTpFontePag() {
        return tpFontePag;
   }

   public void setTpFontePag(BigDecimal tpFontePag) {
        this.tpFontePag = tpFontePag;
   }

   public BigDecimal getTpIrrfExt() {
        return tpIrrfExt;
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        this.tpIrrfExt = tpIrrfExt;
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
        this.nroCnh = vo.asString("NROCNH");
        this.numEntrega = vo.asString("NUMENTREGA");
        this.numReceb = vo.asString("NUMRECEB");
        this.seqVisita = vo.asBigDecimal("SEQVISITA");
        this.multHoraExtra = vo.asBigDecimal("MULTHORAEXTRA");
        this.identificacao = vo.asString("IDENTIFICACAO");
        this.imagem = vo.asBlob("IMAGEM");
        this.isentoTaxaMinBoleta = vo.asString("ISENTOTAXAMINBOLETA");
        this.latitudeEntrega = vo.asString("LATITUDEENTREGA");
        this.logistica = vo.asString("LOGISTICA");
        this.categoriaCnh = vo.asString("CATEGORIACNH");
        this.cepEntrega = vo.asString("CEPENTREGA");
        this.cepReceb = vo.asString("CEPRECEB");
        this.cepTrab = vo.asString("CEPTRAB");
        this.codBaiEntrega = vo.asBigDecimal("CODBAIENTREGA");
        this.codBaiReceb = vo.asBigDecimal("CODBAIRECEB");
        this.codBaiTrab = vo.asBigDecimal("CODBAITRAB");
        this.codCidEntrega = vo.asBigDecimal("CODCIDENTREGA");
        this.codCidReceb = vo.asBigDecimal("CODCIDRECEB");
        this.codCidTrab = vo.asBigDecimal("CODCIDTRAB");
        this.codCred = vo.asBigDecimal("CODCRED");
        this.codEndEntrega = vo.asBigDecimal("CODENDENTREGA");
        this.codEndReceb = vo.asBigDecimal("CODENDRECEB");
        this.codEndTrab = vo.asBigDecimal("CODENDTRAB");
        this.codMoedaLim = vo.asBigDecimal("CODMOEDALIM");
        this.codMoedaRenda = vo.asBigDecimal("CODMOEDARENDA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codSuframa = vo.asString("CODSUFRAMA");
        this.codTabCot = vo.asBigDecimal("CODTABCOT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complEntrega = vo.asString("COMPLENTREGA");
        this.complReceb = vo.asString("COMPLRECEB");
        this.complTrab = vo.asString("COMPLTRAB");
        this.conjuge = vo.asString("CONJUGE");
        this.crea = vo.asString("CREA");
        this.diaPag = vo.asBigDecimal("DIAPAG");
        this.dtAdm = vo.asTimestamp("DTADM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCrea = vo.asTimestamp("DTCREA");
        this.exigePedido = vo.asString("EXIGEPEDIDO");
        this.fatMin = vo.asBigDecimal("FATMIN");
        this.gerarFrete = vo.asString("GERARFRETE");
        this.sugTipNegEntr = vo.asBigDecimal("SUGTIPNEGENTR");
        this.sugTipNegSaid = vo.asBigDecimal("SUGTIPNEGSAID");
        this.telTrab = vo.asString("TELTRAB");
        this.tempoResid = vo.asTimestamp("TEMPORESID");
        this.tipMoradia = vo.asString("TIPMORADIA");
        this.ufCrea = vo.asString("UFCREA");
        this.usaSaidaFatPer = vo.asString("USASAIDAFATPER");
        this.vencimentoCnh = vo.asTimestamp("VENCIMENTOCNH");
        this.viaTransp = vo.asString("VIATRANSP");
        this.grupoDescParc = vo.asString("GRUPODESCPARC");
        this.limCredAutom = vo.asString("LIMCREDAUTOM");
        this.localTrab = vo.asString("LOCALTRAB");
        this.numTrab = vo.asString("NUMTRAB");
        this.pai = vo.asString("PAI");
        this.placaVeiculo = vo.asString("PLACAVEICULO");
        this.ramal = vo.asBigDecimal("RAMAL");
        this.rendaMensal = vo.asBigDecimal("RENDAMENSAL");
        this.seqEntrega = vo.asBigDecimal("SEQENTREGA");
        this.longitudeEntrega = vo.asString("LONGITUDEENTREGA");
        this.mae = vo.asString("MAE");
        this.dhCadSuframa = vo.asTimestamp("DHCADSUFRAMA");
        this.nacionalidade = vo.asBigDecimal("NACIONALIDADE");
        this.naturalidade = vo.asBigDecimal("NATURALIDADE");
        this.sitCadSuframa = vo.asString("SITCADSUFRAMA");
        this.semRepRedAgro = vo.asString("SEMREPREDAGRO");
        this.diaSemanaPag = vo.asBigDecimal("DIASEMANAPAG");
        this.codVolFat = vo.asString("CODVOLFAT");
        this.temSuframaPiscof = vo.asString("TEMSUFRAMAPISCOF");
        this.diaPag2 = vo.asBigDecimal("DIAPAG2");
        this.diaPag3 = vo.asBigDecimal("DIAPAG3");
        this.diaPag4 = vo.asBigDecimal("DIAPAG4");
        this.diaPag5 = vo.asBigDecimal("DIAPAG5");
        this.diaPag6 = vo.asBigDecimal("DIAPAG6");
        this.codIndNif = vo.asBigDecimal("CODINDNIF");
        this.infoIsenImuni = vo.asBigDecimal("INFOISENIMUNI");
        this.numIndNif = vo.asString("NUMINDNIF");
        this.tpFontePag = vo.asBigDecimal("TPFONTEPAG");
        this.tpIrrfExt = vo.asBigDecimal("TPIRRFEXT");
        return this;
   }
}
