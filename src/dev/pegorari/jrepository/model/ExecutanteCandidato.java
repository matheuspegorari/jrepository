package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExecutanteCandidato extends AbstractSankhyaEntity<ExecutanteCandidato> {
   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getSeqEcd() {
        return this.getVo().asBigDecimal("SEQECD");
   }

   public void setSeqEcd(BigDecimal seqEcd) {
        markAsChanged("SEQECD", seqEcd);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   @Override
   public String getTableName() {
        return "TPRECD";
   }

   @Override
   public String getEntityName() {
        return "ExecutanteCandidato";
   }

   @Override
   public ExecutanteCandidato fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
