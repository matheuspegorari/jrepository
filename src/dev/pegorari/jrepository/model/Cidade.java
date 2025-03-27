package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cidade extends AbstractSankhyaEntity<Cidade> {
   public String getMascaraLc116() {
        return this.getVo().asString("MASCARALC116");
   }

   public void setMascaraLc116(String mascaraLc116) {
        markAsChanged("MASCARALC116", mascaraLc116);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodMunDms() {
        return this.getVo().asBigDecimal("CODMUNDMS");
   }

   public void setCodMunDms(BigDecimal codMunDms) {
        markAsChanged("CODMUNDMS", codMunDms);
   }

   public BigDecimal getCodMunFis() {
        return this.getVo().asBigDecimal("CODMUNFIS");
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
   }

   public BigDecimal getCodMunSiafi() {
        return this.getVo().asBigDecimal("CODMUNSIAFI");
   }

   public void setCodMunSiafi(BigDecimal codMunSiafi) {
        markAsChanged("CODMUNSIAFI", codMunSiafi);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public String getDdd() {
        return this.getVo().asString("DDD");
   }

   public void setDdd(String ddd) {
        markAsChanged("DDD", ddd);
   }

   public String getDescricaoCorreio() {
        return this.getVo().asString("DESCRICAOCORREIO");
   }

   public void setDescricaoCorreio(String descricaoCorreio) {
        markAsChanged("DESCRICAOCORREIO", descricaoCorreio);
   }

   public BigDecimal getDistancia() {
        return this.getVo().asBigDecimal("DISTANCIA");
   }

   public void setDistancia(BigDecimal distancia) {
        markAsChanged("DISTANCIA", distancia);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getNomeCid() {
        return this.getVo().asString("NOMECID");
   }

   public void setNomeCid(String nomeCid) {
        markAsChanged("NOMECID", nomeCid);
   }

   public BigDecimal getPopulacao() {
        return this.getVo().asBigDecimal("POPULACAO");
   }

   public void setPopulacao(BigDecimal populacao) {
        markAsChanged("POPULACAO", populacao);
   }

   public BigDecimal getSeqEntrega() {
        return this.getVo().asBigDecimal("SEQENTREGA");
   }

   public void setSeqEntrega(BigDecimal seqEntrega) {
        markAsChanged("SEQENTREGA", seqEntrega);
   }

   public String getTipoFrete() {
        return this.getVo().asString("TIPOFRETE");
   }

   public void setTipoFrete(String tipoFrete) {
        markAsChanged("TIPOFRETE", tipoFrete);
   }

   public BigDecimal getUf() {
        return this.getVo().asBigDecimal("UF");
   }

   public void setUf(BigDecimal uf) {
        markAsChanged("UF", uf);
   }

   public BigDecimal getVlrFreteKm() {
        return this.getVo().asBigDecimal("VLRFRETEKM");
   }

   public void setVlrFreteKm(BigDecimal vlrFreteKm) {
        markAsChanged("VLRFRETEKM", vlrFreteKm);
   }

   public BigDecimal getVlrFreteMin() {
        return this.getVo().asBigDecimal("VLRFRETEMIN");
   }

   public void setVlrFreteMin(BigDecimal vlrFreteMin) {
        markAsChanged("VLRFRETEMIN", vlrFreteMin);
   }

   public BigDecimal getVlrFreteTon() {
        return this.getVo().asBigDecimal("VLRFRETETON");
   }

   public void setVlrFreteTon(BigDecimal vlrFreteTon) {
        markAsChanged("VLRFRETETON", vlrFreteTon);
   }

   public BigDecimal getVlrTaxaEnt() {
        return this.getVo().asBigDecimal("VLRTAXAENT");
   }

   public void setVlrTaxaEnt(BigDecimal vlrTaxaEnt) {
        markAsChanged("VLRTAXAENT", vlrTaxaEnt);
   }

   public String getLongitude() {
        return this.getVo().asString("LONGITUDE");
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
   }

   public String getLatitude() {
        return this.getVo().asString("LATITUDE");
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
   }

   public String getLinkAgua() {
        return this.getVo().asString("LINKAGUA");
   }

   public void setLinkAgua(String linkAgua) {
        markAsChanged("LINKAGUA", linkAgua);
   }

   public String getLinkEnergia() {
        return this.getVo().asString("LINKENERGIA");
   }

   public void setLinkEnergia(String linkEnergia) {
        markAsChanged("LINKENERGIA", linkEnergia);
   }

   public String getLinkIptu() {
        return this.getVo().asString("LINKIPTU");
   }

   public void setLinkIptu(String linkIptu) {
        markAsChanged("LINKIPTU", linkIptu);
   }

   public BigDecimal getMaxNotaLoteNfse() {
        return this.getVo().asBigDecimal("MAXNOTALOTENFSE");
   }

   public void setMaxNotaLoteNfse(BigDecimal maxNotaLoteNfse) {
        markAsChanged("MAXNOTALOTENFSE", maxNotaLoteNfse);
   }

   public String getMetarRedVlrIss() {
        return this.getVo().asString("METARREDVLRISS");
   }

   public void setMetarRedVlrIss(String metarRedVlrIss) {
        markAsChanged("METARREDVLRISS", metarRedVlrIss);
   }

   public String getMotCancSubNfse() {
        return this.getVo().asString("MOTCANCSUBNFSE");
   }

   public void setMotCancSubNfse(String motCancSubNfse) {
        markAsChanged("MOTCANCSUBNFSE", motCancSubNfse);
   }

   public String getNfseTemplateSubst() {
        return this.getVo().asString("NFSETEMPLATESUBST");
   }

   public void setNfseTemplateSubst(String nfseTemplateSubst) {
        markAsChanged("NFSETEMPLATESUBST", nfseTemplateSubst);
   }

   public BigDecimal getTimParcPrefeitura() {
        return this.getVo().asBigDecimal("TIMPARCPREFEITURA");
   }

   public void setTimParcPrefeitura(BigDecimal timParcPrefeitura) {
        markAsChanged("TIMPARCPREFEITURA", timParcPrefeitura);
   }

   public BigDecimal getTipoCnae() {
        return this.getVo().asBigDecimal("TIPOCNAE");
   }

   public void setTipoCnae(BigDecimal tipoCnae) {
        markAsChanged("TIPOCNAE", tipoCnae);
   }

   public String getTipCancNfse() {
        return this.getVo().asString("TIPCANCNFSE");
   }

   public void setTipCancNfse(String tipCancNfse) {
        markAsChanged("TIPCANCNFSE", tipCancNfse);
   }

   public BigDecimal getVlrLimCancNfse() {
        return this.getVo().asBigDecimal("VLRLIMCANCNFSE");
   }

   public void setVlrLimCancNfse(BigDecimal vlrLimCancNfse) {
        markAsChanged("VLRLIMCANCNFSE", vlrLimCancNfse);
   }

   public BigDecimal getVendaMin() {
        return this.getVo().asBigDecimal("VENDAMIN");
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
   }

   public BigDecimal getQtdSub() {
        return this.getVo().asBigDecimal("QTDSUB");
   }

   public void setQtdSub(BigDecimal qtdSub) {
        markAsChanged("QTDSUB", qtdSub);
   }

   public BigDecimal getQtdDiasSub() {
        return this.getVo().asBigDecimal("QTDDIASSUB");
   }

   public void setQtdDiasSub(BigDecimal qtdDiasSub) {
        markAsChanged("QTDDIASSUB", qtdDiasSub);
   }

   public String getTemSubstitNfse() {
        return this.getVo().asString("TEMSUBSTITNFSE");
   }

   public void setTemSubstitNfse(String temSubstitNfse) {
        markAsChanged("TEMSUBSTITNFSE", temSubstitNfse);
   }

   public String getNoFormatLc116() {
        return this.getVo().asString("NOFORMATLC116");
   }

   public void setNoFormatLc116(String noFormatLc116) {
        markAsChanged("NOFORMATLC116", noFormatLc116);
   }

   public String getCnaeFullNfse() {
        return this.getVo().asString("CNAEFULLNFSE");
   }

   public void setCnaeFullNfse(String cnaeFullNfse) {
        markAsChanged("CNAEFULLNFSE", cnaeFullNfse);
   }

   public String getNoInscMunPar() {
        return this.getVo().asString("NOINSCMUNPAR");
   }

   public void setNoInscMunPar(String noInscMunPar) {
        markAsChanged("NOINSCMUNPAR", noInscMunPar);
   }

   public String getJsonSemAliDenMun() {
        return this.getVo().asString("JSONSEMALIDENMUN");
   }

   public void setJsonSemAliDenMun(String jsonSemAliDenMun) {
        markAsChanged("JSONSEMALIDENMUN", jsonSemAliDenMun);
   }

   public BigDecimal getCodParNfse() {
        return this.getVo().asBigDecimal("CODPARCNFSE");
   }

   public void setCodParNfse(BigDecimal codParNfse) {
        markAsChanged("CODPARCNFSE", codParNfse);
   }

   public String getUfNomeCid() {
        return this.getVo().asString("UFNOMECID");
   }

   public void setUfNomeCid(String ufNomeCid) {
        markAsChanged("UFNOMECID", ufNomeCid);
   }

   public String getPerCancNfseSubstit() {
        return this.getVo().asString("PERMCANCNFSESUBSTIT");
   }

   public void setPerCancNfseSubstit(String perCancNfseSubstit) {
        markAsChanged("PERMCANCNFSESUBSTIT", perCancNfseSubstit);
   }

   public BigDecimal getVMinRetencaoIss() {
        return this.getVo().asBigDecimal("VMINRETENCAOISS");
   }

   public void setVMinRetencaoIss(BigDecimal vMinRetencaoIss) {
        markAsChanged("VMINRETENCAOISS", vMinRetencaoIss);
   }

   public String getGerCodNatIssJson() {
        return this.getVo().asString("GERCODNATISSJSON");
   }

   public void setGerCodNatIssJson(String gerCodNatIssJson) {
        markAsChanged("GERCODNATISSJSON", gerCodNatIssJson);
   }

   public String getEnvItensSepJson() {
        return this.getVo().asString("ENVITENSSEPJSON");
   }

   public void setEnvItensSepJson(String envItensSepJson) {
        markAsChanged("ENVITENSSEPJSON", envItensSepJson);
   }

   public BigDecimal getQtdMaxEnvItensJson() {
        return this.getVo().asBigDecimal("QTDMAXENVITENSJSON");
   }

   public void setQtdMaxEnvItensJson(BigDecimal qtdMaxEnvItensJson) {
        markAsChanged("QTDMAXENVITENSJSON", qtdMaxEnvItensJson);
   }

   public String getObsJsonEnotas() {
        return this.getVo().asString("OBSJSONENOTAS");
   }

   public void setObsJsonEnotas(String obsJsonEnotas) {
        markAsChanged("OBSJSONENOTAS", obsJsonEnotas);
   }

   public String getActCanExNt() {
        return this.getVo().asString("ACTCANEXNT");
   }

   public void setActCanExNt(String actCanExNt) {
        markAsChanged("ACTCANEXNT", actCanExNt);
   }

   public String getAtUnuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtUnuVersao(String atUnuVersao) {
        markAsChanged("ATUNUVERSAO", atUnuVersao);
   }

   public String getEnvFpJson() {
        return this.getVo().asString("ENVFPJSON");
   }

   public void setEnvFpJson(String envFpJson) {
        markAsChanged("ENVFPJSON", envFpJson);
   }

   public String getEnvMulEmailJson() {
        return this.getVo().asString("ENVMULEMAILJSON");
   }

   public void setEnvMulEmailJson(String envMulEmailJson) {
        markAsChanged("ENVMULEMAILJSON", envMulEmailJson);
   }

   public String getEnvTagDesconJson() {
        return this.getVo().asString("ENVTAGDESCONJSON");
   }

   public void setEnvTagDesconJson(String envTagDesconJson) {
        markAsChanged("ENVTAGDESCONJSON", envTagDesconJson);
   }

   public String getGerNuNfseInfCpm() {
        return this.getVo().asString("GERNUNFSEINFCPM");
   }

   public void setGerNuNfseInfCpm(String gerNuNfseInfCpm) {
        markAsChanged("GERNUNFSEINFCPM", gerNuNfseInfCpm);
   }

   public String getInfQtdVlrUniJson() {
        return this.getVo().asString("INFQTDVLRUNIJSON");
   }

   public void setInfQtdVlrUniJson(String infQtdVlrUniJson) {
        markAsChanged("INFQTDVLRUNIJSON", infQtdVlrUniJson);
   }

   public String getRemZeroEsquerdaLc116() {
        return this.getVo().asString("REMZEROESQUERDLC116");
   }

   public void setRemZeroEsquerdaLc116(String remZeroEsquerdaLc116) {
        markAsChanged("REMZEROESQUERDLC116", remZeroEsquerdaLc116);
   }

   public String getRegEspTrib() {
        return this.getVo().asString("REGESPTRIB");
   }

   public void setRegEspTrib(String regEspTrib) {
        markAsChanged("REGESPTRIB", regEspTrib);
   }

   public String getGerCnaeMultJson() {
        return this.getVo().asString("GERCNAEMULTJSON");
   }

   public void setGerCnaeMultJson(String gerCnaeMultJson) {
        markAsChanged("GERCNAEMULTJSON", gerCnaeMultJson);
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
        this.setVo(vo);
        return this;
   }
}
