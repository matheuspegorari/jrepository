package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaProducao extends AbstractSankhyaEntity<EtapaProducao> {
   public String getAjustarMps() {
        return this.getVo().asString("AJUSTARMPS");
   }

   public void setAjustarMps(String ajustarMps) {
        markAsChanged("AJUSTARMPS", ajustarMps);
   }

   public String getGerarAmostra() {
        return this.getVo().asString("GERARAMOSTRA");
   }

   public void setGerarAmostra(String gerarAmostra) {
        markAsChanged("GERARAMOSTRA", gerarAmostra);
   }

   public String getLocalOrigEnt() {
        return this.getVo().asString("LOCALORIGENT");
   }

   public void setLocalOrigEnt(String localOrigEnt) {
        markAsChanged("LOCALORIGENT", localOrigEnt);
   }

   public String getLocalOrigSai() {
        return this.getVo().asString("LOCALORIGSAI");
   }

   public void setLocalOrigSai(String localOrigSai) {
        markAsChanged("LOCALORIGSAI", localOrigSai);
   }

   public String getNomeEtapa() {
        return this.getVo().asString("NOMEETAPA");
   }

   public void setNomeEtapa(String nomeEtapa) {
        markAsChanged("NOMEETAPA", nomeEtapa);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getPendenteEnt() {
        return this.getVo().asString("PENDENTEENT");
   }

   public void setPendenteEnt(String pendenteEnt) {
        markAsChanged("PENDENTEENT", pendenteEnt);
   }

   public String getPendenteSai() {
        return this.getVo().asString("PENDENTESAI");
   }

   public void setPendenteSai(String pendenteSai) {
        markAsChanged("PENDENTESAI", pendenteSai);
   }

   public BigDecimal getSeqOtica() {
        return this.getVo().asBigDecimal("SEQOTICA");
   }

   public void setSeqOtica(BigDecimal seqOtica) {
        markAsChanged("SEQOTICA", seqOtica);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getTopDevMp() {
        return this.getVo().asBigDecimal("TOPDEVMP");
   }

   public void setTopDevMp(BigDecimal topDevMp) {
        markAsChanged("TOPDEVMP", topDevMp);
   }

   public BigDecimal getTopEntrada() {
        return this.getVo().asBigDecimal("TOPENTRADA");
   }

   public void setTopEntrada(BigDecimal topEntrada) {
        markAsChanged("TOPENTRADA", topEntrada);
   }

   public BigDecimal getTopProducao() {
        return this.getVo().asBigDecimal("TOPPRODUCAO");
   }

   public void setTopProducao(BigDecimal topProducao) {
        markAsChanged("TOPPRODUCAO", topProducao);
   }

   public BigDecimal getTopSaida() {
        return this.getVo().asBigDecimal("TOPSAIDA");
   }

   public void setTopSaida(BigDecimal topSaida) {
        markAsChanged("TOPSAIDA", topSaida);
   }

   public String getUsaLocEntDestPa() {
        return this.getVo().asString("USALOCENTDESTPA");
   }

   public void setUsaLocEntDestPa(String usaLocEntDestPa) {
        markAsChanged("USALOCENTDESTPA", usaLocEntDestPa);
   }

   public String getUsaLocEntOrigPa() {
        return this.getVo().asString("USALOCENTORIGPA");
   }

   public void setUsaLocEntOrigPa(String usaLocEntOrigPa) {
        markAsChanged("USALOCENTORIGPA", usaLocEntOrigPa);
   }

   public String getUsaLocSaiDestPa() {
        return this.getVo().asString("USALOCSAIDESTPA");
   }

   public void setUsaLocSaiDestPa(String usaLocSaiDestPa) {
        markAsChanged("USALOCSAIDESTPA", usaLocSaiDestPa);
   }

   public String getUsaLocSaiOrigPa() {
        return this.getVo().asString("USALOCSAIORIGPA");
   }

   public void setUsaLocSaiOrigPa(String usaLocSaiOrigPa) {
        markAsChanged("USALOCSAIORIGPA", usaLocSaiOrigPa);
   }

   public String getValidaWms() {
        return this.getVo().asString("VALIDAWMS");
   }

   public void setValidaWms(String validaWms) {
        markAsChanged("VALIDAWMS", validaWms);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodEmpDest() {
        return this.getVo().asBigDecimal("CODEMPDEST");
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        markAsChanged("CODEMPDEST", codEmpDest);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodEtapaMp() {
        return this.getVo().asBigDecimal("CODETAPAMP");
   }

   public void setCodEtapaMp(BigDecimal codEtapaMp) {
        markAsChanged("CODETAPAMP", codEtapaMp);
   }

   public BigDecimal getCodLocalEntDest() {
        return this.getVo().asBigDecimal("CODLOCALENTDEST");
   }

   public void setCodLocalEntDest(BigDecimal codLocalEntDest) {
        markAsChanged("CODLOCALENTDEST", codLocalEntDest);
   }

   public BigDecimal getCodLocalEntOrig() {
        return this.getVo().asBigDecimal("CODLOCALENTORIG");
   }

   public void setCodLocalEntOrig(BigDecimal codLocalEntOrig) {
        markAsChanged("CODLOCALENTORIG", codLocalEntOrig);
   }

   public BigDecimal getCodLocalSaiDest() {
        return this.getVo().asBigDecimal("CODLOCALSAIDEST");
   }

   public void setCodLocalSaiDest(BigDecimal codLocalSaiDest) {
        markAsChanged("CODLOCALSAIDEST", codLocalSaiDest);
   }

   public BigDecimal getCodLocalSaiOrig() {
        return this.getVo().asBigDecimal("CODLOCALSAIORIG");
   }

   public void setCodLocalSaiOrig(BigDecimal codLocalSaiOrig) {
        markAsChanged("CODLOCALSAIORIG", codLocalSaiOrig);
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
        this.setVo(vo);
        return this;
   }
}
