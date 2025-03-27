package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Recebimento extends AbstractSankhyaEntity<Recebimento> {
   public String getDescrsituacao() {
        return this.getVo().asString("DESCRSITUACAO");
   }

   public void setDescrsituacao(String descrsituacao) {
        markAsChanged("DESCRSITUACAO", descrsituacao);
   }

   public String getNumPedido2() {
        return this.getVo().asString("NUMPEDIDO2");
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
   }

   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodEndDoca() {
        return this.getVo().asBigDecimal("CODENDDOCA");
   }

   public void setCodEndDoca(BigDecimal codEndDoca) {
        markAsChanged("CODENDDOCA", codEndDoca);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConfFinal() {
        return this.getVo().asString("CONFFINAL");
   }

   public void setConfFinal(String confFinal) {
        markAsChanged("CONFFINAL", confFinal);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtRecebimento() {
        return this.getVo().asTimestamp("DTRECEBIMENTO");
   }

   public void setDtRecebimento(Timestamp dtRecebimento) {
        markAsChanged("DTRECEBIMENTO", dtRecebimento);
   }

   public String getNomeParc() {
        return this.getVo().asString("NOMEPARC");
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getSituacao() {
        return this.getVo().asBigDecimal("SITUACAO");
   }

   public void setSituacao(BigDecimal situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getStatusConf() {
        return this.getVo().asBigDecimal("STATUSCONF");
   }

   public void setStatusConf(BigDecimal statusConf) {
        markAsChanged("STATUSCONF", statusConf);
   }

   public String getUsaConfParcial() {
        return this.getVo().asString("USACONFPARCIAL");
   }

   public void setUsaConfParcial(String usaConfParcial) {
        markAsChanged("USACONFPARCIAL", usaConfParcial);
   }

   public BigDecimal getNuTarefaCan() {
        return this.getVo().asBigDecimal("NUTAREFACAN");
   }

   public void setNuTarefaCan(BigDecimal nuTarefaCan) {
        markAsChanged("NUTAREFACAN", nuTarefaCan);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getTipoNota() {
        return this.getVo().asBigDecimal("TIPONOTA");
   }

   public void setTipoNota(BigDecimal tipoNota) {
        markAsChanged("TIPONOTA", tipoNota);
   }

   @Override
   public String getTableName() {
        return "TGWREC";
   }

   @Override
   public String getEntityName() {
        return "Recebimento";
   }

   @Override
   public Recebimento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
