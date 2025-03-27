package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemTarefa extends AbstractSankhyaEntity<ItemTarefa> {
   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public BigDecimal getCodArmazenagem() {
        return this.getVo().asBigDecimal("CODARMAZENAGEM");
   }

   public void setCodArmazenagem(BigDecimal codArmazenagem) {
        markAsChanged("CODARMAZENAGEM", codArmazenagem);
   }

   public BigDecimal getCodAreaSep() {
        return this.getVo().asBigDecimal("CODAREASEP");
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
   }

   public String getCodBarraVolCompra() {
        return this.getVo().asString("CODBARRAVOLCOMPRA");
   }

   public void setCodBarraVolCompra(String codBarraVolCompra) {
        markAsChanged("CODBARRAVOLCOMPRA", codBarraVolCompra);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEndDestino() {
        return this.getVo().asBigDecimal("CODENDDESTINO");
   }

   public void setCodEndDestino(BigDecimal codEndDestino) {
        markAsChanged("CODENDDESTINO", codEndDestino);
   }

   public BigDecimal getCodEndOrigem() {
        return this.getVo().asBigDecimal("CODENDORIGEM");
   }

   public void setCodEndOrigem(BigDecimal codEndOrigem) {
        markAsChanged("CODENDORIGEM", codEndOrigem);
   }

   public BigDecimal getCodEquip() {
        return this.getVo().asBigDecimal("CODEQUIP");
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsuExec() {
        return this.getVo().asBigDecimal("CODUSUEXEC");
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
   }

   public String getCodVolCompra() {
        return this.getVo().asString("CODVOLCOMPRA");
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
   }

   public String getCodVolDest() {
        return this.getVo().asString("CODVOLDEST");
   }

   public void setCodVolDest(String codVolDest) {
        markAsChanged("CODVOLDEST", codVolDest);
   }

   public String getCodVolOrig() {
        return this.getVo().asString("CODVOLORIG");
   }

   public void setCodVolOrig(String codVolOrig) {
        markAsChanged("CODVOLORIG", codVolOrig);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhFinalExec() {
        return this.getVo().asTimestamp("DHFINALEXEC");
   }

   public void setDhFinalExec(Timestamp dhFinalExec) {
        markAsChanged("DHFINALEXEC", dhFinalExec);
   }

   public Timestamp getDhInicialExec() {
        return this.getVo().asTimestamp("DHINICIALEXEC");
   }

   public void setDhInicialExec(Timestamp dhInicialExec) {
        markAsChanged("DHINICIALEXEC", dhInicialExec);
   }

   public BigDecimal getFaseTarefa() {
        return this.getVo().asBigDecimal("FASETAREFA");
   }

   public void setFaseTarefa(BigDecimal faseTarefa) {
        markAsChanged("FASETAREFA", faseTarefa);
   }

   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public String getOcorrencia() {
        return this.getVo().asString("OCORRENCIA");
   }

   public void setOcorrencia(String ocorrencia) {
        markAsChanged("OCORRENCIA", ocorrencia);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getQtdDest() {
        return this.getVo().asBigDecimal("QTDDEST");
   }

   public void setQtdDest(BigDecimal qtdDest) {
        markAsChanged("QTDDEST", qtdDest);
   }

   public BigDecimal getQtdOrig() {
        return this.getVo().asBigDecimal("QTDORIG");
   }

   public void setQtdOrig(BigDecimal qtdOrig) {
        markAsChanged("QTDORIG", qtdOrig);
   }

   public BigDecimal getQtdVolCompra() {
        return this.getVo().asBigDecimal("QTDVOLCOMPRA");
   }

   public void setQtdVolCompra(BigDecimal qtdVolCompra) {
        markAsChanged("QTDVOLCOMPRA", qtdVolCompra);
   }

   public BigDecimal getQtdVolPad() {
        return this.getVo().asBigDecimal("QTDVOLPAD");
   }

   public void setQtdVolPad(BigDecimal qtdVolPad) {
        markAsChanged("QTDVOLPAD", qtdVolPad);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTipTarefa() {
        return this.getVo().asString("TIPTAREFA");
   }

   public void setTipTarefa(String tipTarefa) {
        markAsChanged("TIPTAREFA", tipTarefa);
   }

   public Timestamp getDhFimMapa() {
        return this.getVo().asTimestamp("DHFIMMAPA");
   }

   public void setDhFimMapa(Timestamp dhFimMapa) {
        markAsChanged("DHFIMMAPA", dhFimMapa);
   }

   public Timestamp getDhImpMapa() {
        return this.getVo().asTimestamp("DHIMPMAPA");
   }

   public void setDhImpMapa(Timestamp dhImpMapa) {
        markAsChanged("DHIMPMAPA", dhImpMapa);
   }

   public Timestamp getDhInicioMapa() {
        return this.getVo().asTimestamp("DHINICIOMAPA");
   }

   public void setDhInicioMapa(Timestamp dhInicioMapa) {
        markAsChanged("DHINICIOMAPA", dhInicioMapa);
   }

   public BigDecimal getIdMapa() {
        return this.getVo().asBigDecimal("IDMAPA");
   }

   public void setIdMapa(BigDecimal idMapa) {
        markAsChanged("IDMAPA", idMapa);
   }

   public String getTriado() {
        return this.getVo().asString("TRIADO");
   }

   public void setTriado(String triado) {
        markAsChanged("TRIADO", triado);
   }

   @Override
   public String getTableName() {
        return "TGWITT";
   }

   @Override
   public String getEntityName() {
        return "ItemTarefa";
   }

   @Override
   public ItemTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
