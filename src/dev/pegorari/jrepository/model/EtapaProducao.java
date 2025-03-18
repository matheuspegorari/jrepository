package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaProducao extends AbstractSankhyaEntity<EtapaProducao> {
   private String ajustarMps;
   private String gerarAmostra;
   private String localOrigEnt;
   private String localOrigSai;
   private String nomeEtapa;
   private String observacao;
   private String pendenteEnt;
   private String pendenteSai;
   private BigDecimal seqOtica;
   private String tipo;
   private BigDecimal topDevMp;
   private BigDecimal topEntrada;
   private BigDecimal topProducao;
   private BigDecimal topSaida;
   private String usaLocEntDestPa;
   private String usaLocEntOrigPa;
   private String usaLocSaiDestPa;
   private String usaLocSaiOrigPa;
   private String validaWms;
   private BigDecimal codCencus;
   private BigDecimal codEmpDest;
   private BigDecimal codEmpOrig;
   private BigDecimal codEtapa;
   private BigDecimal codEtapaMp;
   private BigDecimal codLocalEntDest;
   private BigDecimal codLocalEntOrig;
   private BigDecimal codLocalSaiDest;
   private BigDecimal codLocalSaiOrig;

   public String getAjustarMps() {
        return ajustarMps;
   }

   public void setAjustarMps(String ajustarMps) {
        markAsChanged("AJUSTARMPS", ajustarMps);
        this.ajustarMps = ajustarMps;
   }

   public String getGerarAmostra() {
        return gerarAmostra;
   }

   public void setGerarAmostra(String gerarAmostra) {
        markAsChanged("GERARAMOSTRA", gerarAmostra);
        this.gerarAmostra = gerarAmostra;
   }

   public String getLocalOrigEnt() {
        return localOrigEnt;
   }

   public void setLocalOrigEnt(String localOrigEnt) {
        markAsChanged("LOCALORIGENT", localOrigEnt);
        this.localOrigEnt = localOrigEnt;
   }

   public String getLocalOrigSai() {
        return localOrigSai;
   }

   public void setLocalOrigSai(String localOrigSai) {
        markAsChanged("LOCALORIGSAI", localOrigSai);
        this.localOrigSai = localOrigSai;
   }

   public String getNomeEtapa() {
        return nomeEtapa;
   }

   public void setNomeEtapa(String nomeEtapa) {
        markAsChanged("NOMEETAPA", nomeEtapa);
        this.nomeEtapa = nomeEtapa;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getPendenteEnt() {
        return pendenteEnt;
   }

   public void setPendenteEnt(String pendenteEnt) {
        markAsChanged("PENDENTEENT", pendenteEnt);
        this.pendenteEnt = pendenteEnt;
   }

   public String getPendenteSai() {
        return pendenteSai;
   }

   public void setPendenteSai(String pendenteSai) {
        markAsChanged("PENDENTESAI", pendenteSai);
        this.pendenteSai = pendenteSai;
   }

   public BigDecimal getSeqOtica() {
        return seqOtica;
   }

   public void setSeqOtica(BigDecimal seqOtica) {
        markAsChanged("SEQOTICA", seqOtica);
        this.seqOtica = seqOtica;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getTopDevMp() {
        return topDevMp;
   }

   public void setTopDevMp(BigDecimal topDevMp) {
        markAsChanged("TOPDEVMP", topDevMp);
        this.topDevMp = topDevMp;
   }

   public BigDecimal getTopEntrada() {
        return topEntrada;
   }

   public void setTopEntrada(BigDecimal topEntrada) {
        markAsChanged("TOPENTRADA", topEntrada);
        this.topEntrada = topEntrada;
   }

   public BigDecimal getTopProducao() {
        return topProducao;
   }

   public void setTopProducao(BigDecimal topProducao) {
        markAsChanged("TOPPRODUCAO", topProducao);
        this.topProducao = topProducao;
   }

   public BigDecimal getTopSaida() {
        return topSaida;
   }

   public void setTopSaida(BigDecimal topSaida) {
        markAsChanged("TOPSAIDA", topSaida);
        this.topSaida = topSaida;
   }

   public String getUsaLocEntDestPa() {
        return usaLocEntDestPa;
   }

   public void setUsaLocEntDestPa(String usaLocEntDestPa) {
        markAsChanged("USALOCENTDESTPA", usaLocEntDestPa);
        this.usaLocEntDestPa = usaLocEntDestPa;
   }

   public String getUsaLocEntOrigPa() {
        return usaLocEntOrigPa;
   }

   public void setUsaLocEntOrigPa(String usaLocEntOrigPa) {
        markAsChanged("USALOCENTORIGPA", usaLocEntOrigPa);
        this.usaLocEntOrigPa = usaLocEntOrigPa;
   }

   public String getUsaLocSaiDestPa() {
        return usaLocSaiDestPa;
   }

   public void setUsaLocSaiDestPa(String usaLocSaiDestPa) {
        markAsChanged("USALOCSAIDESTPA", usaLocSaiDestPa);
        this.usaLocSaiDestPa = usaLocSaiDestPa;
   }

   public String getUsaLocSaiOrigPa() {
        return usaLocSaiOrigPa;
   }

   public void setUsaLocSaiOrigPa(String usaLocSaiOrigPa) {
        markAsChanged("USALOCSAIORIGPA", usaLocSaiOrigPa);
        this.usaLocSaiOrigPa = usaLocSaiOrigPa;
   }

   public String getValidaWms() {
        return validaWms;
   }

   public void setValidaWms(String validaWms) {
        markAsChanged("VALIDAWMS", validaWms);
        this.validaWms = validaWms;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmpDest() {
        return codEmpDest;
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        markAsChanged("CODEMPDEST", codEmpDest);
        this.codEmpDest = codEmpDest;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
        this.codEmpOrig = codEmpOrig;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodEtapaMp() {
        return codEtapaMp;
   }

   public void setCodEtapaMp(BigDecimal codEtapaMp) {
        markAsChanged("CODETAPAMP", codEtapaMp);
        this.codEtapaMp = codEtapaMp;
   }

   public BigDecimal getCodLocalEntDest() {
        return codLocalEntDest;
   }

   public void setCodLocalEntDest(BigDecimal codLocalEntDest) {
        markAsChanged("CODLOCALENTDEST", codLocalEntDest);
        this.codLocalEntDest = codLocalEntDest;
   }

   public BigDecimal getCodLocalEntOrig() {
        return codLocalEntOrig;
   }

   public void setCodLocalEntOrig(BigDecimal codLocalEntOrig) {
        markAsChanged("CODLOCALENTORIG", codLocalEntOrig);
        this.codLocalEntOrig = codLocalEntOrig;
   }

   public BigDecimal getCodLocalSaiDest() {
        return codLocalSaiDest;
   }

   public void setCodLocalSaiDest(BigDecimal codLocalSaiDest) {
        markAsChanged("CODLOCALSAIDEST", codLocalSaiDest);
        this.codLocalSaiDest = codLocalSaiDest;
   }

   public BigDecimal getCodLocalSaiOrig() {
        return codLocalSaiOrig;
   }

   public void setCodLocalSaiOrig(BigDecimal codLocalSaiOrig) {
        markAsChanged("CODLOCALSAIORIG", codLocalSaiOrig);
        this.codLocalSaiOrig = codLocalSaiOrig;
   }

   @Override
   public String getTableName() {
        return "TGFETA";
   }

   @Override
   public String getEntityName() {
        return "EtapaProducao";
   }

   @Override
   public EtapaProducao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ajustarMps = vo.asString("AJUSTARMPS");
        this.gerarAmostra = vo.asString("GERARAMOSTRA");
        this.localOrigEnt = vo.asString("LOCALORIGENT");
        this.localOrigSai = vo.asString("LOCALORIGSAI");
        this.nomeEtapa = vo.asString("NOMEETAPA");
        this.observacao = vo.asString("OBSERVACAO");
        this.pendenteEnt = vo.asString("PENDENTEENT");
        this.pendenteSai = vo.asString("PENDENTESAI");
        this.seqOtica = vo.asBigDecimal("SEQOTICA");
        this.tipo = vo.asString("TIPO");
        this.topDevMp = vo.asBigDecimal("TOPDEVMP");
        this.topEntrada = vo.asBigDecimal("TOPENTRADA");
        this.topProducao = vo.asBigDecimal("TOPPRODUCAO");
        this.topSaida = vo.asBigDecimal("TOPSAIDA");
        this.usaLocEntDestPa = vo.asString("USALOCENTDESTPA");
        this.usaLocEntOrigPa = vo.asString("USALOCENTORIGPA");
        this.usaLocSaiDestPa = vo.asString("USALOCSAIDESTPA");
        this.usaLocSaiOrigPa = vo.asString("USALOCSAIORIGPA");
        this.validaWms = vo.asString("VALIDAWMS");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmpDest = vo.asBigDecimal("CODEMPDEST");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codEtapaMp = vo.asBigDecimal("CODETAPAMP");
        this.codLocalEntDest = vo.asBigDecimal("CODLOCALENTDEST");
        this.codLocalEntOrig = vo.asBigDecimal("CODLOCALENTORIG");
        this.codLocalSaiDest = vo.asBigDecimal("CODLOCALSAIDEST");
        this.codLocalSaiOrig = vo.asBigDecimal("CODLOCALSAIORIG");
        return this;
   }
}
