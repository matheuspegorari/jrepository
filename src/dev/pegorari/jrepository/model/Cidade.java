package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cidade extends AbstractSankhyaEntity<Cidade> {
   private String mascaraLc116;
   private BigDecimal codCid;
   private BigDecimal codMunDms;
   private BigDecimal codMunFis;
   private BigDecimal codMunSiafi;
   private BigDecimal codReg;
   private String ddd;
   private String descricaoCorreio;
   private BigDecimal distancia;
   private Timestamp dtAlter;
   private String nomeCid;
   private BigDecimal populacao;
   private BigDecimal seqEntrega;
   private String tipoFrete;
   private BigDecimal uf;
   private BigDecimal vlrFreteKm;
   private BigDecimal vlrFreteMin;
   private BigDecimal vlrFreteTon;
   private BigDecimal vlrTaxaEnt;
   private String longitude;
   private String latitude;
   private String linkAgua;
   private String linkEnergia;
   private String linkIptu;
   private BigDecimal maxNotaLoteNfse;
   private String metarRedVlrIss;
   private String motCancSubNfse;
   private String nfseTemplateSubst;
   private BigDecimal timParcPrefeitura;
   private BigDecimal tipoCnae;
   private String tipCancNfse;
   private BigDecimal vlrLimCancNfse;
   private BigDecimal vendaMin;
   private BigDecimal qtdSub;
   private BigDecimal qtdDiasSub;
   private String temSubstitNfse;
   private String noFormatLc116;
   private String cnaeFullNfse;
   private String noInscMunPar;
   private String jsonSemAliDenMun;
   private BigDecimal codParNfse;
   private String ufNomeCid;
   private String perCancNfseSubstit;
   private BigDecimal vMinRetencaoIss;
   private String gerCodNatIssJson;
   private String envItensSepJson;
   private BigDecimal qtdMaxEnvItensJson;
   private String obsJsonEnotas;
   private String actCanExNt;
   private String atUnuVersao;
   private String envFpJson;
   private String envMulEmailJson;
   private String envTagDesconJson;
   private String gerNuNfseInfCpm;
   private String infQtdVlrUniJson;
   private String remZeroEsquerdaLc116;
   private String regEspTrib;
   private String gerCnaeMultJson;

   public String getMascaraLc116() {
        return mascaraLc116;
   }

   public void setMascaraLc116(String mascaraLc116) {
        markAsChanged("MASCARALC116", mascaraLc116);
        this.mascaraLc116 = mascaraLc116;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodMunDms() {
        return codMunDms;
   }

   public void setCodMunDms(BigDecimal codMunDms) {
        markAsChanged("CODMUNDMS", codMunDms);
        this.codMunDms = codMunDms;
   }

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
        this.codMunFis = codMunFis;
   }

   public BigDecimal getCodMunSiafi() {
        return codMunSiafi;
   }

   public void setCodMunSiafi(BigDecimal codMunSiafi) {
        markAsChanged("CODMUNSIAFI", codMunSiafi);
        this.codMunSiafi = codMunSiafi;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public String getDdd() {
        return ddd;
   }

   public void setDdd(String ddd) {
        markAsChanged("DDD", ddd);
        this.ddd = ddd;
   }

   public String getDescricaoCorreio() {
        return descricaoCorreio;
   }

   public void setDescricaoCorreio(String descricaoCorreio) {
        markAsChanged("DESCRICAOCORREIO", descricaoCorreio);
        this.descricaoCorreio = descricaoCorreio;
   }

   public BigDecimal getDistancia() {
        return distancia;
   }

   public void setDistancia(BigDecimal distancia) {
        markAsChanged("DISTANCIA", distancia);
        this.distancia = distancia;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getNomeCid() {
        return nomeCid;
   }

   public void setNomeCid(String nomeCid) {
        markAsChanged("NOMECID", nomeCid);
        this.nomeCid = nomeCid;
   }

   public BigDecimal getPopulacao() {
        return populacao;
   }

   public void setPopulacao(BigDecimal populacao) {
        markAsChanged("POPULACAO", populacao);
        this.populacao = populacao;
   }

   public BigDecimal getSeqEntrega() {
        return seqEntrega;
   }

   public void setSeqEntrega(BigDecimal seqEntrega) {
        markAsChanged("SEQENTREGA", seqEntrega);
        this.seqEntrega = seqEntrega;
   }

   public String getTipoFrete() {
        return tipoFrete;
   }

   public void setTipoFrete(String tipoFrete) {
        markAsChanged("TIPOFRETE", tipoFrete);
        this.tipoFrete = tipoFrete;
   }

   public BigDecimal getUf() {
        return uf;
   }

   public void setUf(BigDecimal uf) {
        markAsChanged("UF", uf);
        this.uf = uf;
   }

   public BigDecimal getVlrFreteKm() {
        return vlrFreteKm;
   }

   public void setVlrFreteKm(BigDecimal vlrFreteKm) {
        markAsChanged("VLRFRETEKM", vlrFreteKm);
        this.vlrFreteKm = vlrFreteKm;
   }

   public BigDecimal getVlrFreteMin() {
        return vlrFreteMin;
   }

   public void setVlrFreteMin(BigDecimal vlrFreteMin) {
        markAsChanged("VLRFRETEMIN", vlrFreteMin);
        this.vlrFreteMin = vlrFreteMin;
   }

   public BigDecimal getVlrFreteTon() {
        return vlrFreteTon;
   }

   public void setVlrFreteTon(BigDecimal vlrFreteTon) {
        markAsChanged("VLRFRETETON", vlrFreteTon);
        this.vlrFreteTon = vlrFreteTon;
   }

   public BigDecimal getVlrTaxaEnt() {
        return vlrTaxaEnt;
   }

   public void setVlrTaxaEnt(BigDecimal vlrTaxaEnt) {
        markAsChanged("VLRTAXAENT", vlrTaxaEnt);
        this.vlrTaxaEnt = vlrTaxaEnt;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
        this.longitude = longitude;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
        this.latitude = latitude;
   }

   public String getLinkAgua() {
        return linkAgua;
   }

   public void setLinkAgua(String linkAgua) {
        markAsChanged("LINKAGUA", linkAgua);
        this.linkAgua = linkAgua;
   }

   public String getLinkEnergia() {
        return linkEnergia;
   }

   public void setLinkEnergia(String linkEnergia) {
        markAsChanged("LINKENERGIA", linkEnergia);
        this.linkEnergia = linkEnergia;
   }

   public String getLinkIptu() {
        return linkIptu;
   }

   public void setLinkIptu(String linkIptu) {
        markAsChanged("LINKIPTU", linkIptu);
        this.linkIptu = linkIptu;
   }

   public BigDecimal getMaxNotaLoteNfse() {
        return maxNotaLoteNfse;
   }

   public void setMaxNotaLoteNfse(BigDecimal maxNotaLoteNfse) {
        markAsChanged("MAXNOTALOTENFSE", maxNotaLoteNfse);
        this.maxNotaLoteNfse = maxNotaLoteNfse;
   }

   public String getMetarRedVlrIss() {
        return metarRedVlrIss;
   }

   public void setMetarRedVlrIss(String metarRedVlrIss) {
        markAsChanged("METARREDVLRISS", metarRedVlrIss);
        this.metarRedVlrIss = metarRedVlrIss;
   }

   public String getMotCancSubNfse() {
        return motCancSubNfse;
   }

   public void setMotCancSubNfse(String motCancSubNfse) {
        markAsChanged("MOTCANCSUBNFSE", motCancSubNfse);
        this.motCancSubNfse = motCancSubNfse;
   }

   public String getNfseTemplateSubst() {
        return nfseTemplateSubst;
   }

   public void setNfseTemplateSubst(String nfseTemplateSubst) {
        markAsChanged("NFSETEMPLATESUBST", nfseTemplateSubst);
        this.nfseTemplateSubst = nfseTemplateSubst;
   }

   public BigDecimal getTimParcPrefeitura() {
        return timParcPrefeitura;
   }

   public void setTimParcPrefeitura(BigDecimal timParcPrefeitura) {
        markAsChanged("TIMPARCPREFEITURA", timParcPrefeitura);
        this.timParcPrefeitura = timParcPrefeitura;
   }

   public BigDecimal getTipoCnae() {
        return tipoCnae;
   }

   public void setTipoCnae(BigDecimal tipoCnae) {
        markAsChanged("TIPOCNAE", tipoCnae);
        this.tipoCnae = tipoCnae;
   }

   public String getTipCancNfse() {
        return tipCancNfse;
   }

   public void setTipCancNfse(String tipCancNfse) {
        markAsChanged("TIPCANCNFSE", tipCancNfse);
        this.tipCancNfse = tipCancNfse;
   }

   public BigDecimal getVlrLimCancNfse() {
        return vlrLimCancNfse;
   }

   public void setVlrLimCancNfse(BigDecimal vlrLimCancNfse) {
        markAsChanged("VLRLIMCANCNFSE", vlrLimCancNfse);
        this.vlrLimCancNfse = vlrLimCancNfse;
   }

   public BigDecimal getVendaMin() {
        return vendaMin;
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
        this.vendaMin = vendaMin;
   }

   public BigDecimal getQtdSub() {
        return qtdSub;
   }

   public void setQtdSub(BigDecimal qtdSub) {
        markAsChanged("QTDSUB", qtdSub);
        this.qtdSub = qtdSub;
   }

   public BigDecimal getQtdDiasSub() {
        return qtdDiasSub;
   }

   public void setQtdDiasSub(BigDecimal qtdDiasSub) {
        markAsChanged("QTDDIASSUB", qtdDiasSub);
        this.qtdDiasSub = qtdDiasSub;
   }

   public String getTemSubstitNfse() {
        return temSubstitNfse;
   }

   public void setTemSubstitNfse(String temSubstitNfse) {
        markAsChanged("TEMSUBSTITNFSE", temSubstitNfse);
        this.temSubstitNfse = temSubstitNfse;
   }

   public String getNoFormatLc116() {
        return noFormatLc116;
   }

   public void setNoFormatLc116(String noFormatLc116) {
        markAsChanged("NOFORMATLC116", noFormatLc116);
        this.noFormatLc116 = noFormatLc116;
   }

   public String getCnaeFullNfse() {
        return cnaeFullNfse;
   }

   public void setCnaeFullNfse(String cnaeFullNfse) {
        markAsChanged("CNAEFULLNFSE", cnaeFullNfse);
        this.cnaeFullNfse = cnaeFullNfse;
   }

   public String getNoInscMunPar() {
        return noInscMunPar;
   }

   public void setNoInscMunPar(String noInscMunPar) {
        markAsChanged("NOINSCMUNPAR", noInscMunPar);
        this.noInscMunPar = noInscMunPar;
   }

   public String getJsonSemAliDenMun() {
        return jsonSemAliDenMun;
   }

   public void setJsonSemAliDenMun(String jsonSemAliDenMun) {
        markAsChanged("JSONSEMALIDENMUN", jsonSemAliDenMun);
        this.jsonSemAliDenMun = jsonSemAliDenMun;
   }

   public BigDecimal getCodParNfse() {
        return codParNfse;
   }

   public void setCodParNfse(BigDecimal codParNfse) {
        markAsChanged("CODPARCNFSE", codParNfse);
        this.codParNfse = codParNfse;
   }

   public String getUfNomeCid() {
        return ufNomeCid;
   }

   public void setUfNomeCid(String ufNomeCid) {
        markAsChanged("UFNOMECID", ufNomeCid);
        this.ufNomeCid = ufNomeCid;
   }

   public String getPerCancNfseSubstit() {
        return perCancNfseSubstit;
   }

   public void setPerCancNfseSubstit(String perCancNfseSubstit) {
        markAsChanged("PERMCANCNFSESUBSTIT", perCancNfseSubstit);
        this.perCancNfseSubstit = perCancNfseSubstit;
   }

   public BigDecimal getVMinRetencaoIss() {
        return vMinRetencaoIss;
   }

   public void setVMinRetencaoIss(BigDecimal vMinRetencaoIss) {
        markAsChanged("VMINRETENCAOISS", vMinRetencaoIss);
        this.vMinRetencaoIss = vMinRetencaoIss;
   }

   public String getGerCodNatIssJson() {
        return gerCodNatIssJson;
   }

   public void setGerCodNatIssJson(String gerCodNatIssJson) {
        markAsChanged("GERCODNATISSJSON", gerCodNatIssJson);
        this.gerCodNatIssJson = gerCodNatIssJson;
   }

   public String getEnvItensSepJson() {
        return envItensSepJson;
   }

   public void setEnvItensSepJson(String envItensSepJson) {
        markAsChanged("ENVITENSSEPJSON", envItensSepJson);
        this.envItensSepJson = envItensSepJson;
   }

   public BigDecimal getQtdMaxEnvItensJson() {
        return qtdMaxEnvItensJson;
   }

   public void setQtdMaxEnvItensJson(BigDecimal qtdMaxEnvItensJson) {
        markAsChanged("QTDMAXENVITENSJSON", qtdMaxEnvItensJson);
        this.qtdMaxEnvItensJson = qtdMaxEnvItensJson;
   }

   public String getObsJsonEnotas() {
        return obsJsonEnotas;
   }

   public void setObsJsonEnotas(String obsJsonEnotas) {
        markAsChanged("OBSJSONENOTAS", obsJsonEnotas);
        this.obsJsonEnotas = obsJsonEnotas;
   }

   public String getActCanExNt() {
        return actCanExNt;
   }

   public void setActCanExNt(String actCanExNt) {
        markAsChanged("ACTCANEXNT", actCanExNt);
        this.actCanExNt = actCanExNt;
   }

   public String getAtUnuVersao() {
        return atUnuVersao;
   }

   public void setAtUnuVersao(String atUnuVersao) {
        markAsChanged("ATUNUVERSAO", atUnuVersao);
        this.atUnuVersao = atUnuVersao;
   }

   public String getEnvFpJson() {
        return envFpJson;
   }

   public void setEnvFpJson(String envFpJson) {
        markAsChanged("ENVFPJSON", envFpJson);
        this.envFpJson = envFpJson;
   }

   public String getEnvMulEmailJson() {
        return envMulEmailJson;
   }

   public void setEnvMulEmailJson(String envMulEmailJson) {
        markAsChanged("ENVMULEMAILJSON", envMulEmailJson);
        this.envMulEmailJson = envMulEmailJson;
   }

   public String getEnvTagDesconJson() {
        return envTagDesconJson;
   }

   public void setEnvTagDesconJson(String envTagDesconJson) {
        markAsChanged("ENVTAGDESCONJSON", envTagDesconJson);
        this.envTagDesconJson = envTagDesconJson;
   }

   public String getGerNuNfseInfCpm() {
        return gerNuNfseInfCpm;
   }

   public void setGerNuNfseInfCpm(String gerNuNfseInfCpm) {
        markAsChanged("GERNUNFSEINFCPM", gerNuNfseInfCpm);
        this.gerNuNfseInfCpm = gerNuNfseInfCpm;
   }

   public String getInfQtdVlrUniJson() {
        return infQtdVlrUniJson;
   }

   public void setInfQtdVlrUniJson(String infQtdVlrUniJson) {
        markAsChanged("INFQTDVLRUNIJSON", infQtdVlrUniJson);
        this.infQtdVlrUniJson = infQtdVlrUniJson;
   }

   public String getRemZeroEsquerdaLc116() {
        return remZeroEsquerdaLc116;
   }

   public void setRemZeroEsquerdaLc116(String remZeroEsquerdaLc116) {
        markAsChanged("REMZEROESQUERDLC116", remZeroEsquerdaLc116);
        this.remZeroEsquerdaLc116 = remZeroEsquerdaLc116;
   }

   public String getRegEspTrib() {
        return regEspTrib;
   }

   public void setRegEspTrib(String regEspTrib) {
        markAsChanged("REGESPTRIB", regEspTrib);
        this.regEspTrib = regEspTrib;
   }

   public String getGerCnaeMultJson() {
        return gerCnaeMultJson;
   }

   public void setGerCnaeMultJson(String gerCnaeMultJson) {
        markAsChanged("GERCNAEMULTJSON", gerCnaeMultJson);
        this.gerCnaeMultJson = gerCnaeMultJson;
   }

   @Override
   public String getTableName() {
        return "TSICID";
   }

   @Override
   public String getEntityName() {
        return "Cidade";
   }

   @Override
   public Cidade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.mascaraLc116 = vo.asString("MASCARALC116");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codMunDms = vo.asBigDecimal("CODMUNDMS");
        this.codMunFis = vo.asBigDecimal("CODMUNFIS");
        this.codMunSiafi = vo.asBigDecimal("CODMUNSIAFI");
        this.codReg = vo.asBigDecimal("CODREG");
        this.ddd = vo.asString("DDD");
        this.descricaoCorreio = vo.asString("DESCRICAOCORREIO");
        this.distancia = vo.asBigDecimal("DISTANCIA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nomeCid = vo.asString("NOMECID");
        this.populacao = vo.asBigDecimal("POPULACAO");
        this.seqEntrega = vo.asBigDecimal("SEQENTREGA");
        this.tipoFrete = vo.asString("TIPOFRETE");
        this.uf = vo.asBigDecimal("UF");
        this.vlrFreteKm = vo.asBigDecimal("VLRFRETEKM");
        this.vlrFreteMin = vo.asBigDecimal("VLRFRETEMIN");
        this.vlrFreteTon = vo.asBigDecimal("VLRFRETETON");
        this.vlrTaxaEnt = vo.asBigDecimal("VLRTAXAENT");
        this.longitude = vo.asString("LONGITUDE");
        this.latitude = vo.asString("LATITUDE");
        this.linkAgua = vo.asString("LINKAGUA");
        this.linkEnergia = vo.asString("LINKENERGIA");
        this.linkIptu = vo.asString("LINKIPTU");
        this.maxNotaLoteNfse = vo.asBigDecimal("MAXNOTALOTENFSE");
        this.metarRedVlrIss = vo.asString("METARREDVLRISS");
        this.motCancSubNfse = vo.asString("MOTCANCSUBNFSE");
        this.nfseTemplateSubst = vo.asString("NFSETEMPLATESUBST");
        this.timParcPrefeitura = vo.asBigDecimal("TIMPARCPREFEITURA");
        this.tipoCnae = vo.asBigDecimal("TIPOCNAE");
        this.tipCancNfse = vo.asString("TIPCANCNFSE");
        this.vlrLimCancNfse = vo.asBigDecimal("VLRLIMCANCNFSE");
        this.vendaMin = vo.asBigDecimal("VENDAMIN");
        this.qtdSub = vo.asBigDecimal("QTDSUB");
        this.qtdDiasSub = vo.asBigDecimal("QTDDIASSUB");
        this.temSubstitNfse = vo.asString("TEMSUBSTITNFSE");
        this.noFormatLc116 = vo.asString("NOFORMATLC116");
        this.cnaeFullNfse = vo.asString("CNAEFULLNFSE");
        this.noInscMunPar = vo.asString("NOINSCMUNPAR");
        this.jsonSemAliDenMun = vo.asString("JSONSEMALIDENMUN");
        this.codParNfse = vo.asBigDecimal("CODPARCNFSE");
        this.ufNomeCid = vo.asString("UFNOMECID");
        this.perCancNfseSubstit = vo.asString("PERMCANCNFSESUBSTIT");
        this.vMinRetencaoIss = vo.asBigDecimal("VMINRETENCAOISS");
        this.gerCodNatIssJson = vo.asString("GERCODNATISSJSON");
        this.envItensSepJson = vo.asString("ENVITENSSEPJSON");
        this.qtdMaxEnvItensJson = vo.asBigDecimal("QTDMAXENVITENSJSON");
        this.obsJsonEnotas = vo.asString("OBSJSONENOTAS");
        this.actCanExNt = vo.asString("ACTCANEXNT");
        this.atUnuVersao = vo.asString("ATUNUVERSAO");
        this.envFpJson = vo.asString("ENVFPJSON");
        this.envMulEmailJson = vo.asString("ENVMULEMAILJSON");
        this.envTagDesconJson = vo.asString("ENVTAGDESCONJSON");
        this.gerNuNfseInfCpm = vo.asString("GERNUNFSEINFCPM");
        this.infQtdVlrUniJson = vo.asString("INFQTDVLRUNIJSON");
        this.remZeroEsquerdaLc116 = vo.asString("REMZEROESQUERDLC116");
        this.regEspTrib = vo.asString("REGESPTRIB");
        this.gerCnaeMultJson = vo.asString("GERCNAEMULTJSON");
        return this;
   }
}
